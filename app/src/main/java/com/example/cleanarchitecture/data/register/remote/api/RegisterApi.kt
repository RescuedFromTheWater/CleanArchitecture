package com.example.cleanarchitecture.data.register.remote.api

import com.example.cleanarchitecture.data.common.utils.WrappedResponse
import com.example.cleanarchitecture.data.register.remote.dto.RegisterRequest
import com.example.cleanarchitecture.data.register.remote.dto.RegisterResponse
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterApi {
    @POST("auth/register")
    suspend fun register(
        @Body registerRequest: RegisterRequest
    ) : Response<WrappedResponse<RegisterResponse>>
}