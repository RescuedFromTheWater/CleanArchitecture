package com.example.cleanarchitecture.data.product.remote.api

import com.example.cleanarchitecture.data.common.utils.WrappedListResponse
import com.example.cleanarchitecture.data.product.remote.dto.ProductResponse
import okhttp3.Response
import retrofit2.http.*

interface ProductApi {
    @GET("product/")
    suspend fun getAllMyProducts(

    ): Response<WrappedListResponse<ProductResponse>>

    @GET("product/{id}")
    suspend fun getProductById(
        @Path("id") id: String
    ): Response<WrappedResponse<ProductResponse>>

    @PUT("product/{id}")
    suspend fun updateProduct(
        @Body productUpdateRequest: ProductUpdateRequest,
        @Path("id") id: String
    ): Response<WrappedResponse<ProductResponse>>

    @DELETE("product/{id}")
    suspend fun deleteProduct(
        @Path("id") id: String
    ): Response<WrappedResponse<ProductResponse>>

    @POST("product/")
    suspend fun createProduct(
        @Body productCreateRequest: ProductCreateRequest
    ): Response<WrappedResponse<ProductResponse>>
}