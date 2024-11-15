package com.andreirookie.impl.domain.usecase

import com.andreirookie.api.domain.CoreResult
import com.andreirookie.impl.domain.ChatDto

internal interface GetChatDataUseCase {
    operator fun invoke(userId: Int): CoreResult<ChatDto>
}
