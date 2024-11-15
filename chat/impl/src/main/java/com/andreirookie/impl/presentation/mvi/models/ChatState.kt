package com.andreirookie.impl.presentation.mvi.models

import com.andreirookie.api.presentation.State
import com.andreirookie.impl.domain.MessageDto

internal data class ChatState(
    val userName: String = "",
    val userAvatarImage: String = "",
    val isLoading: Boolean = false,
    val messages: List<MessageDto> = emptyList()
) : State