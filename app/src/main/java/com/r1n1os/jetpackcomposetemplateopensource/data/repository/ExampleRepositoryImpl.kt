package com.r1n1os.jetpackcomposetemplateopensource.data.repository

import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.dao.ExampleDao
import com.r1n1os.jetpackcomposetemplateopensource.data.mapper.toExampleEntity
import com.r1n1os.jetpackcomposetemplateopensource.data.mapper.toExampleModel
import com.r1n1os.jetpackcomposetemplateopensource.domain.models.ExampleModel
import com.r1n1os.jetpackcomposetemplateopensource.domain.repository.ExampleRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ExampleRepositoryImpl  @Inject constructor(
    private val exampleDao: ExampleDao
) : ExampleRepository {
    override suspend fun insertExampleModel(exampleModel: ExampleModel) {
        exampleDao.insertExampleEntity(exampleEntity = exampleModel.toExampleEntity())
    }

    override suspend fun getExampleModelList(): Flow<MutableList<ExampleModel>> {
        return exampleDao.getExampleEntityList()
            .map { exampleEntityList ->
                exampleEntityList.map { exampleEntity ->
                    exampleEntity.toExampleModel()
                }.toMutableList()
            }
    }
}
