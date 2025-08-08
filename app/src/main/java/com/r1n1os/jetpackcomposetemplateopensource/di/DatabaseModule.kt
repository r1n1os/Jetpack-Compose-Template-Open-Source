package com.r1n1os.jetpackcomposetemplateopensource.di

import android.content.Context
import androidx.room.Room
import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.JetpackComposeTemplateOpenSourceDatabase
import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.dao.ExampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlin.jvm.java

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): JetpackComposeTemplateOpenSourceDatabase {
        return Room.databaseBuilder(
            appContext,
            JetpackComposeTemplateOpenSourceDatabase::class.java,
            "jetpackComposeTemplateOpenSourceDatabase_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideExampleDao(database: JetpackComposeTemplateOpenSourceDatabase): ExampleDao {
        return database.exampleDao
    }

}