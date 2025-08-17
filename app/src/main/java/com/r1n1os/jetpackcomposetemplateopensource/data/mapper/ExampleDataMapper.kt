package com.r1n1os.jetpackcomposetemplateopensource.data.mapper

import com.r1n1os.jetpackcomposetemplateopensource.data.localDatabase.entity.ExampleEntity
import com.r1n1os.jetpackcomposetemplateopensource.data.network.ExampleDto
import com.r1n1os.jetpackcomposetemplateopensource.domain.models.ExampleModel
import java.util.UUID

/**
 * This mapper is used to map the network(DTOs) or local database(Entities) to the domain model and vice versa.
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

fun ExampleModel.toExampleDto(): ExampleDto {
    return ExampleDto(
        id = UUID.randomUUID().toString(),
        name = name,
        age = age

    )
}

fun ExampleDto.toExampleModel(): ExampleModel {
    return ExampleModel(
        name = name,
        age = age,
    )
}