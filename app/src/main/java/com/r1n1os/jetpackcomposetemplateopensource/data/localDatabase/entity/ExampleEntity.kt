package com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExampleEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val name: String,
    val age: Int,
)
