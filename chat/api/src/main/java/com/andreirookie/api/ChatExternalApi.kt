package com.andreirookie.api

interface ChatExternalApi {
    fun chatProvider(): ChatDependenciesProvider
}