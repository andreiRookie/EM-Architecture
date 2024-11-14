package com.andreirookie.impl.domain

internal interface MessageRepository {
    fun getChatById(id: Int): ChatDto
}