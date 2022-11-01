package com.example.cleanarchitecture.domain.product.usecase

import com.example.cleanarchitecture.data.common.utils.WrappedResponse
import com.example.cleanarchitecture.data.product.remote.dto.ProductResponse
import com.example.cleanarchitecture.domain.common.base.BaseResult
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DeleteProductByIdUseCase
@Inject constructor(
    private val productRepository: ProductRepository
) { suspend fun invoke(
        id: String
    ): Flow<BaseResult<Unit, WrappedResponse<ProductResponse>>> {
        return productRepository.deleteProductById(id)
    }
}