package com.andreirookie.impl.data

import com.andreirookie.api.domain.CoreResult
import com.andreirookie.impl.domain.ChatDto
import com.andreirookie.impl.domain.MessageRepository

internal class MessageRepositoryImpl(
    private val chatWebApi: ChatWebApi
) : MessageRepository {
    override fun getChatBy(userId: Int): CoreResult<ChatDto> {
        return try {
            CoreResult.Success(chatWebApi.getChat(userId).toDto())
        } catch (ex: Exception) {
            CoreResult.Error(ex)
        }
    }
}