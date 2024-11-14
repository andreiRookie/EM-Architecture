package com.andreirookie.impl.domain


internal interface UserRepository {
    fun getUsers(): List<UserDto>
    fun getUserById(id: Int): UserDto
}