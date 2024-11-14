package com.andreirookie.api.di

import com.andreirookie.api.domain.RetrofitProvider

interface NetworkProvider {
    fun provideRetrofit(): RetrofitProvider
}