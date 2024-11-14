package com.andreirookie.impl.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

internal class UserListFragment : Fragment(), UserListPresenterContract.UserListView {
    private lateinit var presenter: UserListPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.attachView(this)
    }

    override fun onDestroyView() {
        presenter.detachView()
        super.onDestroyView()
    }
}