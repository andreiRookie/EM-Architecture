package com.andreirookie.impl.domain.usecase

import com.andreirookie.impl.domain.ChatDto

internal interface GetChatDataUseCase {
    operator fun invoke(chatId: Int): ChatDto
}
