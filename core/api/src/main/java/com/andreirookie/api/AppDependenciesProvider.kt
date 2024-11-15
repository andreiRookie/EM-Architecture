package com.andreirookie.api

interface AppDependenciesProvider {
    fun appDependencies(): AppDependenciesFacade
}