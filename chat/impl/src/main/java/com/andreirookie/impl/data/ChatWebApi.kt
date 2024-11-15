package com.andreirookie.impl.data

internal interface ChatWebApi {
    fun getChat(userId: Int): ChatWebDto
}