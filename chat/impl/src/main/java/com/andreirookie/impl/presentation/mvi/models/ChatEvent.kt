package com.andreirookie.impl.presentation.mvi.models

import com.andreirookie.api.presentation.Event
import com.andreirookie.impl.domain.ChatDto

internal sealed interface ChatEvent : Event {
    data object LoadingStarted : ChatEvent
    data class ChatLoaded(val data: ChatDto): ChatEvent
    data class LoadError(val error: Throwable): ChatEvent
}