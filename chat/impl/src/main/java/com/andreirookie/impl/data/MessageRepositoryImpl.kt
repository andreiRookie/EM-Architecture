package com.andreirookie.impl.data

import com.andreirookie.impl.domain.ChatDto
import com.andreirookie.impl.domain.MessageRepository

internal class MessageRepositoryImpl(
    private val chatWebApi: ChatWebApi
) : MessageRepository {
    override fun getChatById(id: Int): ChatDto {
        return chatWebApi.getChat(id).toDto()
    }
}