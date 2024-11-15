package com.andreirookie.api.domain

sealed class CoreResult<out T : Any> {
    data class Success<out T : Any>(val data: T): CoreResult<T>()
    data class Error(val ex: Exception): CoreResult<Nothing>()
}