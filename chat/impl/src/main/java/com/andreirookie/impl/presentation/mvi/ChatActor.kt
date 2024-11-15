package com.andreirookie.impl.presentation.mvi

import com.andreirookie.api.domain.CoreResult
import com.andreirookie.api.presentation.Actor
import com.andreirookie.impl.domain.usecase.GetChatDataUseCase
import com.andreirookie.impl.presentation.mvi.models.ChatAction
import com.andreirookie.impl.presentation.mvi.models.ChatEvent

internal class ChatActor(
    private val getChatDataUseCase: GetChatDataUseCase
) : Actor<ChatAction, ChatEvent> {
    override fun execute(action: ChatAction) = when (action) {
        is ChatAction.LoadChatData -> {
            when (val result = getChatDataUseCase.invoke(action.userId)) {
                is CoreResult.Success -> ChatEvent.ChatLoaded(result.data)
                is CoreResult.Error -> ChatEvent.LoadError(result.ex)
            }
        }
    }
}