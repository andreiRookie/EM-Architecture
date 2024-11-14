package com.andreirookie.impl.data

internal interface UserWebApi {
    fun getUsersFromWeb(): List<UserFromWeb>
    fun getUserFromWebById(id: Int): UserFromWeb
}