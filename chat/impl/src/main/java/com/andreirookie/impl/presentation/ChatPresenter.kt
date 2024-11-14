package com.andreirookie.impl.presentation

import com.andreirookie.api.presentation.BasePresenter
import com.andreirookie.impl.domain.usecase.GetChatDataUseCase

internal class ChatPresenter(
    private val getChatDataUseCase: GetChatDataUseCase
) : ChatPresenterContract.ChatPresenter, BasePresenter<ChatPresenterContract.ChatView>() {
}