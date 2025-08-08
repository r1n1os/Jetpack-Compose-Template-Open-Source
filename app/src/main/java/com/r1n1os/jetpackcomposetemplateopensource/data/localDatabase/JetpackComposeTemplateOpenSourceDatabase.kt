package com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.dao.ExampleDao
import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.entity.ExampleEntity

@Database(
    entities = [ExampleEntity::class],
    version = 1,
    exportSchema = false
)
abstract class JetpackComposeTemplateOpenSourceDatabase: RoomDatabase() {

    abstract val exampleDao: ExampleDao
}