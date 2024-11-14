package com.andreirookie.impl.data

import com.andreirookie.impl.domain.ChatDto
import com.andreirookie.impl.domain.MessageDto
import com.andreirookie.impl.domain.ReactionDto


internal fun ChatWebDto.toDto(): ChatDto {
    return ChatDto(
        id = this.id,
        userName = this.userName,
        userAvatarImage = this.userAvatarImage,
        messages = this.messages.map { it.toDto() }
    )
}

internal fun MessageWebDto.toDto(): MessageDto {
    return MessageDto(
        id = this.id,
        message = this.message,
        reactions = this.reactions.map { it.toDto() }
    )
}

internal fun ReactionWebDto.toDto(): ReactionDto = ReactionDto(this.emoji, this.count)