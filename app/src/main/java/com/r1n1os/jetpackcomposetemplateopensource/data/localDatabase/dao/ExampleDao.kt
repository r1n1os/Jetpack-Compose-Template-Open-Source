package com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.entity.ExampleEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {
    @Upsert
    suspend fun insertExampleEntity(todo: ExampleEntity)

    @Query("SELECT * FROM exampleentity")
    fun getExampleEntityList(): Flow<MutableList<ExampleEntity>>
}