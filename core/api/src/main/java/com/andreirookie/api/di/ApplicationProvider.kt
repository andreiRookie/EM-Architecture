package com.andreirookie.api.di

import android.content.Context

interface ApplicationProvider {
    fun context(): Context
}