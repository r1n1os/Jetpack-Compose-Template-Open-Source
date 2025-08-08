package com.r1n1os.jetpackcomposetemplateopensource.data.repository

import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.dao.ExampleDao
import com.r1n1os.jetpackcomposetemplateopensource.domain.models.ExampleUIModel
import com.r1n1os.jetpackcomposetemplateopensource.domain.repository.ExampleRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class ExampleRepositoryImpl  @Inject constructor(
    private val exampleDao: ExampleDao
) : ExampleRepository {
    override fun insertExampleModel(exampleModel: ExampleUIModel) {
        TODO("Not yet implemented")
    }

    override fun getExampleModelList(): Flow<MutableList<ExampleUIModel>> {
        TODO("Not yet implemented")
    }
}
