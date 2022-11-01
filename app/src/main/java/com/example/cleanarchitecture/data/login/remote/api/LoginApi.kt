package com.example.cleanarchitecture.data.login.remote.api

import com.example.cleanarchitecture.data.common.utils.WrappedResponse
import com.example.cleanarchitecture.data.login.remote.dto.LoginRequest
import com.example.cleanarchitecture.data.login.remote.dto.LoginResponse
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {
    @POST("auth/login")
    suspend fun login(
        @Body loginRequest: LoginRequest): Response<WrappedResponse<LoginResponse>>
}