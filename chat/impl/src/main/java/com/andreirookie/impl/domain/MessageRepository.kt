package com.andreirookie.impl.domain

import com.andreirookie.api.domain.CoreResult

internal interface MessageRepository {
    fun getChatBy(userId: Int): CoreResult<ChatDto>
}