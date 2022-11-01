package com.example.cleanarchitecture.domain.login.usecase

import com.example.cleanarchitecture.data.common.utils.WrappedResponse
import com.example.cleanarchitecture.data.login.remote.dto.LoginRequest
import com.example.cleanarchitecture.data.login.remote.dto.LoginResponse
import com.example.cleanarchitecture.domain.common.base.BaseResult
import com.example.cleanarchitecture.domain.login.entity.LoginEntity
import kotlinx.coroutines.flow.Flow

interface LoginRepository {
    suspend fun login(loginRequest: LoginRequest
    ) : Flow<BaseResult<LoginEntity, WrappedResponse<LoginResponse>>>
}