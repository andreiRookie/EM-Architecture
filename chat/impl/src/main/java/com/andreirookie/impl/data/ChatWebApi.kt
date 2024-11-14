package com.andreirookie.impl.data

internal interface ChatWebApi {
    fun getChat(chatId: Int): ChatWebDto
}