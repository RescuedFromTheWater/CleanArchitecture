package com.example.cleanarchitecture.data.register

import com.example.cleanarchitecture.data.common.module.NetworkModule
import com.example.cleanarchitecture.data.register.remote.api.RegisterApi
import com.example.cleanarchitecture.data.register.repository.RegisterRepositoryImpl
import com.example.cleanarchitecture.domain.register.usecase.RegisterRepository
import com.google.android.datatransport.runtime.dagger.Module
import com.google.android.datatransport.runtime.dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
class RegisterModule {
    @Singleton
    @Provides
    fun provideRegisterApi(retrofit: Retrofit) : RegisterApi {
        return retrofit.create(RegisterApi::class.java)
    }

    @Singleton
    @Provides
    fun provideRegisterRepository(registerApi: RegisterApi) : RegisterRepository {
        return RegisterRepositoryImpl(registerApi)
    }
}