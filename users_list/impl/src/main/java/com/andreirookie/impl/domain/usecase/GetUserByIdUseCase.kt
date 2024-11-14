package com.andreirookie.impl.domain.usecase

import com.andreirookie.impl.domain.UserDto

internal interface GetUserByIdUseCase {
    operator fun invoke(id: Int): UserDto
}