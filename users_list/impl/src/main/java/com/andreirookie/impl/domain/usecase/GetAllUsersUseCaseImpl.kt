package com.andreirookie.impl.domain.usecase

import com.andreirookie.impl.domain.UserDto
import com.andreirookie.impl.domain.UserRepository

internal class GetAllUsersUseCaseImpl(
    private val repository: UserRepository
) : GetAllUsersUseCase {
    override fun invoke(): List<UserDto> {
        return repository.getUsers()
    }
}