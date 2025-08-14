package com.r1n1os.jetpackcomposetemplateopensource.domain.repository

import com.r1n1os.jetpackcomposetemplateopensource.domain.models.ExampleModel
import kotlinx.coroutines.flow.Flow

interface ExampleRepository {
    suspend fun insertExampleModel(exampleModel: ExampleModel)
    suspend fun getExampleModelList(): Flow<MutableList<ExampleModel>>
}