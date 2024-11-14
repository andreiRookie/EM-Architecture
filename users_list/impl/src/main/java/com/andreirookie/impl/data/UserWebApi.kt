package com.andreirookie.impl.data

internal interface UserWebApi {
    fun getUsersFromWeb(): List<UserWebDto>
    fun getUserFromWebById(id: Int): UserWebDto
}