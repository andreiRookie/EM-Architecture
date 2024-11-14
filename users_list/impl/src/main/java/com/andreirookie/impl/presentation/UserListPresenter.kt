package com.andreirookie.impl.presentation

import com.andreirookie.api.presentation.BasePresenter
import com.andreirookie.impl.domain.usecase.GetUserByIdUseCase
import com.andreirookie.impl.domain.usecase.GetAllUsersUseCase

internal class UserListPresenter(
    private val getUserByIdUseCase: GetUserByIdUseCase,
    private val getAllUsersUseCase: GetAllUsersUseCase
) : UserListPresenterContract.Presenter, BasePresenter<UserListPresenterContract.UserListView>() {
}