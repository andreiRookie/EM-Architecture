package com.andreirookie.impl.presentation

import androidx.lifecycle.ViewModel
import com.andreirookie.api.presentation.Store
import com.andreirookie.impl.presentation.mvi.models.ChatAction
import com.andreirookie.impl.presentation.mvi.models.ChatEvent
import com.andreirookie.impl.presentation.mvi.models.ChatState

internal class ChatViewModel(
    private val store: Store<ChatState, ChatEvent, ChatAction>,
) : ViewModel() {

    val state = store.currentState

    fun dispatch(action: ChatAction) {
        store.handleAction(action)
    }
}