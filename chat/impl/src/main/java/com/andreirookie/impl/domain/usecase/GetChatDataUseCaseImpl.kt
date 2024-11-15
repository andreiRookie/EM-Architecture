package com.andreirookie.impl.domain.usecase

import com.andreirookie.api.domain.CoreResult
import com.andreirookie.impl.domain.ChatDto
import com.andreirookie.impl.domain.MessageRepository

internal class GetChatDataUseCaseImpl(
    private val repository: MessageRepository
) : GetChatDataUseCase {
    override fun invoke(userId: Int): CoreResult<ChatDto> {
        return repository.getChatBy(userId)
    }
}