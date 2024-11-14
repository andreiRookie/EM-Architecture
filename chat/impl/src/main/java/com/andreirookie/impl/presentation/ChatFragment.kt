package com.andreirookie.impl.presentation

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

internal class ChatFragment : Fragment(), ChatPresenterContract.ChatView {

    private lateinit var presenter: ChatPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.attachView(this)
    }

    override fun onDestroyView() {
        presenter.detachView()
        super.onDestroyView()
    }

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