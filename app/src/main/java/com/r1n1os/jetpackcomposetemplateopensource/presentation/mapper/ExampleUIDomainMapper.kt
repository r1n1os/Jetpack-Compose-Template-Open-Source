package com.r1n1os.jetpackcomposetemplateopensource.presentation.mapper

import com.r1n1os.jetpackcomposetemplateopensource.domain.models.ExampleModel
import com.r1n1os.jetpackcomposetemplateopensource.presentation.ui_models.ExampleUIModel

/**
 * This mapper as is in the presentation layer is server as mapper
 * between the domain and presentation layers.
 * */
fun ExampleModel.toExampleUIModel(): ExampleUIModel {
    return ExampleUIModel(
        name = name,
        age = age

    )
}

fun ExampleUIModel.toExampleModel(): ExampleModel {
    return ExampleModel(
        name = name,
        age = age,
    )
}