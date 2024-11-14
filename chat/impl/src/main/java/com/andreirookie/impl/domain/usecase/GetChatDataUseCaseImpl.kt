package com.andreirookie.impl.domain.usecase

import com.andreirookie.impl.domain.ChatDto
import com.andreirookie.impl.domain.MessageRepository

internal class GetChatDataUseCaseImpl(
    private val repository: MessageRepository
) : GetChatDataUseCase {
    override fun invoke(chatId: Int): ChatDto {
        return repository.getChatById(chatId)
    }
}