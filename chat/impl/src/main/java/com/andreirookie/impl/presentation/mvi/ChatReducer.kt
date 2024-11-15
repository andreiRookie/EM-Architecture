package com.andreirookie.impl.presentation.mvi

import com.andreirookie.api.presentation.Reducer
import com.andreirookie.impl.presentation.mvi.models.ChatEvent
import com.andreirookie.impl.presentation.mvi.models.ChatState

internal class ChatReducer : Reducer<ChatState, ChatEvent> {
    override fun reduce(state: ChatState, event: ChatEvent): ChatState {
        return when (event) {
            is ChatEvent.LoadingStarted -> {
                state.copy(isLoading = true)
            }
            is ChatEvent.ChatLoaded -> {
                state.copy(
                    userName = event.data.userName,
                    userAvatarImage = event.data.userAvatarImage,
                    isLoading = false,
                    messages = event.data.messages
                )
            }
            is ChatEvent.LoadError -> {
                state.copy(isLoading = false)
            }
        }
    }
}