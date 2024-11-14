package com.andreirookie.impl.domain.usecase

import com.andreirookie.impl.domain.UserDto

internal interface GetAllUsersUseCase {
    operator fun invoke(): List<UserDto>
}