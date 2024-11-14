package com.andreirookie.impl.presentation

import com.andreirookie.api.presentation.BaseView
import com.andreirookie.api.presentation.IPresenter

internal interface UserListPresenterContract {
    interface Presenter : IPresenter<UserListView>
    interface UserListView: BaseView
}