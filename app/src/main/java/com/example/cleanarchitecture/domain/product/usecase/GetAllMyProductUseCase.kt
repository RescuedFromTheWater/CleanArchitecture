package com.example.cleanarchitecture.domain.product.usecase

import com.example.cleanarchitecture.data.common.utils.WrappedListResponse
import com.example.cleanarchitecture.data.product.remote.dto.ProductResponse
import com.example.cleanarchitecture.domain.common.base.BaseResult
import com.example.cleanarchitecture.domain.product.entity.ProductEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllMyProductUseCase
@Inject constructor(
    private val productRepository: ProductRepository
) { suspend fun invoke(
    ): Flow<BaseResult<List<ProductEntity>, WrappedListResponse<ProductResponse>>> {
        return productRepository.getAllMyProducts()
    }
}