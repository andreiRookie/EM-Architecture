package com.andreirookie.api

interface UserListExternalApi {
    fun usersListProvider(): UserListDependenciesProvider
}