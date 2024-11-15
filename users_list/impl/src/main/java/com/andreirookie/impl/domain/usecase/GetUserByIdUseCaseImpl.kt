package com.andreirookie.impl.domain.usecase

import com.andreirookie.impl.domain.UserDto
import com.andreirookie.impl.domain.UserRepository

internal class GetUserByIdUseCaseImpl(
    private val repository: UserRepository
) : GetUserByIdUseCase {
    override fun invoke(id: Int): UserDto {
        return repository.getUserById(id)
    }

}