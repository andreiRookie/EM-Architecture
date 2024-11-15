package com.andreirookie.impl.presentation

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

internal class ChatFragment : Fragment() {

    companion object {
        private const val CHAT_ID = "chat_fragment_id"

        fun create(chatId: Int): ChatFragment {
            val fragment = ChatFragment()
            val bundle = bundleOf(CHAT_ID to chatId)
            fragment.arguments = bundle
            return fragment
        }
    }
}