package com.example.cleanarchitecture.domain.register.usecase

import com.example.cleanarchitecture.data.common.utils.WrappedResponse
import com.example.cleanarchitecture.data.register.remote.dto.RegisterRequest
import com.example.cleanarchitecture.data.register.remote.dto.RegisterResponse
import com.example.cleanarchitecture.domain.common.base.BaseResult
import com.example.cleanarchitecture.domain.register.entity.RegisterEntity
import kotlinx.coroutines.flow.Flow

interface RegisterRepository {
    suspend fun register(
        registerRequest: RegisterRequest
    ): Flow<BaseResult<RegisterEntity,
            WrappedResponse<RegisterResponse>>>
}