package com.example.cleanarchitecture.data.login

import com.example.cleanarchitecture.data.common.module.NetworkModule
import com.example.cleanarchitecture.data.login.remote.api.LoginApi
import com.example.cleanarchitecture.data.login.repository.LoginRepositoryImpl
import com.example.cleanarchitecture.domain.login.usecase.LoginRepository
import com.google.android.datatransport.runtime.dagger.Module
import com.google.android.datatransport.runtime.dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
class LoginModule {

    @Singleton
    @Provides
    fun provideLoginApi(retrofit: Retrofit): LoginApi {
        return retrofit.create(LoginApi::class.java)
    }

    @Singleton
    @Provides
    fun provideLoginRepository(loginApi: LoginApi): LoginRepository {
        return LoginRepositoryImpl(loginApi)
    }
}