package com.andreirookie.impl.domain


internal data class ChatDto(
    val userId: Int,
    val userName: String,
    val userAvatarImage: String,
    val messages: List<MessageDto> = emptyList()
)
internal data class MessageDto(
    val id: Int,
    val message: String,
    val reactions: List<ReactionDto> = emptyList()
)

internal data class ReactionDto(
    val emoji: String,
    val count: Int
)
