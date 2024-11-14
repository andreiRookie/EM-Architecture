package com.andreirookie.impl.data

import com.andreirookie.impl.domain.UserDto

internal data class UserWebDto(
    val id: Int,
    val name: String
) {
    fun toUserDto(): UserDto = UserDto(this.id, this.name)
}
