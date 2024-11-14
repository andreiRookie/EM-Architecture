package com.andreirookie.impl.presentation

import com.andreirookie.api.presentation.BaseView
import com.andreirookie.api.presentation.IPresenter

internal interface ChatPresenterContract {
    interface ChatPresenter : IPresenter<ChatView>
    interface ChatView : BaseView
}