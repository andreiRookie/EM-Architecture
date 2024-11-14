package com.andreirookie.impl.presentation

import androidx.lifecycle.ViewModel
import com.andreirookie.impl.domain.usecase.GetUserByIdUseCase
import com.andreirookie.impl.domain.usecase.GetAllUsersUseCase

internal class UserLIstViewModel(
    private val getUserByIdUseCase: GetUserByIdUseCase,
    private val getAllUsersUseCase: GetAllUsersUseCase
) : ViewModel() {
}