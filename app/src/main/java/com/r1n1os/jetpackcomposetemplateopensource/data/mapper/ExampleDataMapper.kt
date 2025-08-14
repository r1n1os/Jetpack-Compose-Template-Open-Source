package com.r1n1os.jetpackcomposetemplateopensource.data.mapper

import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.entity.ExampleEntity
import com.r1n1os.jetpackcomposetemplateopensource.domain.models.ExampleModel
import java.util.UUID

/**
 * This mapper as is in the data layer is server as mapper
 * between the domain and data layers.
 * */
fun ExampleModel.toExampleEntity(): ExampleEntity {
    return ExampleEntity(
        id = UUID.randomUUID().toString(),
        name = name,
        age = age

    )
}

fun ExampleEntity.toExampleModel(): ExampleModel {
    return ExampleModel(
        name = name,
        age = age,
    )
}