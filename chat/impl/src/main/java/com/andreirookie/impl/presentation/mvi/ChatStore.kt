package com.andreirookie.impl.presentation.mvi

import com.andreirookie.api.presentation.Store
import com.andreirookie.impl.domain.usecase.GetChatDataUseCase
import com.andreirookie.impl.presentation.mvi.models.ChatAction
import com.andreirookie.impl.presentation.mvi.models.ChatEvent
import com.andreirookie.impl.presentation.mvi.models.ChatState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

internal class ChatStore(
    getChatDataUseCase: GetChatDataUseCase
) : Store<ChatState, ChatEvent, ChatAction>(
    initialState = ChatState(),
    reducer = ChatReducer(),
    actor = ChatActor(getChatDataUseCase)
) {

    private val scope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    private val _currentState = MutableStateFlow<ChatState>(initialState)
    override val currentState: StateFlow<ChatState>
        get() = _currentState.asStateFlow()

    private val _events = Channel<ChatEvent>()
    override val events: Flow<ChatEvent>
        get() = _events.receiveAsFlow()

    private val _actions = MutableSharedFlow<ChatAction>()
    override val actions: SharedFlow<ChatAction>
        get() = _actions.asSharedFlow()


    init {
        startExecuteActions()
        startReduceEvents()
    }

    override fun handleAction(action: ChatAction) {
        scope.launch {
            _actions.emit(action)
        }
    }

    private fun startReduceEvents() {
        scope.launch {
            events.collect { event ->
                _currentState.emit(reducer.reduce(_currentState.value, event))
            }
        }
    }

    private fun startExecuteActions() {
        scope.launch {
            actions.collect { action ->
                _events.send(actor.execute(action))
            }
        }
    }
}