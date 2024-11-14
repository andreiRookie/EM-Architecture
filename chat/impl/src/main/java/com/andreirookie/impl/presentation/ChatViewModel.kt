package com.andreirookie.impl.presentation

import androidx.lifecycle.ViewModel
import com.andreirookie.impl.domain.usecase.GetChatDataUseCase

internal class ChatViewModel(
    private val getChatDataUseCase: GetChatDataUseCase
) : ViewModel() {
}