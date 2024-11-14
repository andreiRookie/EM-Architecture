package com.andreirookie.impl.data

internal data class ChatWebDto(
    val id: Int,
    val userName: String,
    val userAvatarImage: String,
    val messages: List<MessageWebDto> = emptyList()
)
internal data class MessageWebDto(
    val id: Int,
    val message: String,
    val reactions: List<ReactionWebDto> = emptyList()
)

internal data class ReactionWebDto(
    val emoji: String,
    val count: Int
)
