package com.andreirookie.impl.presentation.mvi.models

import com.andreirookie.api.presentation.Action

internal sealed interface ChatAction : Action {
    data class LoadChatData(val userId: Int) : ChatAction
}