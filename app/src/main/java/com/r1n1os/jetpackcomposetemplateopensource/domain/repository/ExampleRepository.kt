package com.r1n1os.jetpackcomposetemplateopensource.domain.repository

import com.r1n1os.jetpackcomposetemplateopensource.domain.models.ExampleUIModel
import kotlinx.coroutines.flow.Flow

interface ExampleRepository {
    fun insertExampleModel(exampleModel: ExampleUIModel)
    fun getExampleModelList(): Flow<MutableList<ExampleUIModel>>
}