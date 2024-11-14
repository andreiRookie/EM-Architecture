package com.andreirookie.api

import androidx.fragment.app.Fragment

interface ChatDependenciesProvider {
    fun provideChatFragment(chatId: Int): Fragment
}