package com.andreirookie.impl.data

import com.andreirookie.impl.domain.UserDto
import com.andreirookie.impl.domain.UserRepository

internal class UserRepositoryImpl(
    private val webApi: UserWebApi
) : UserRepository {
    override fun getUsers(): List<UserDto> {
        return webApi.getUsersFromWeb().map { it.toUserDto() }
    }

    override fun getUserById(id: Int): UserDto {
        return webApi.getUserFromWebById(id).toUserDto()
    }
}