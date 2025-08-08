package com.r1n1os.jetpackcomposetemplateopensource.data.mapper

import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.entity.ExampleEntity
import com.r1n1os.jetpackcomposetemplateopensource.domain.models.ExampleUIModel
import java.util.UUID

fun ExampleUIModel.toExampleEntity(): ExampleEntity {
    return ExampleEntity(
        id = UUID.randomUUID().toString(),
        name = name,
        age = age

    )
}

fun ExampleEntity.toExampleUIModel(): ExampleUIModel {
    return ExampleUIModel(
        name = name,
        age = age,
    )
}