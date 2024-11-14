package com.andreirookie.impl.external_api

import androidx.fragment.app.Fragment
import com.andreirookie.api.ChatDependenciesProvider
import com.andreirookie.impl.presentation.ChatFragment

internal class ChatDependenciesProviderImpl : ChatDependenciesProvider {
    override fun provideChatFragment(chatId: Int): Fragment {
        return ChatFragment.create(chatId)
    }
}