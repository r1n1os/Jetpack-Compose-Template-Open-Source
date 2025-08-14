package com.r1n1os.jetpackcomposetemplateopensource.domain.models

/**
 * This is an example of Domain model representing the core business logic of a User.
 *
 * This model is used to transfer data between the data and presentation layers
 * in a clean, decoupled way. It isolates business rules from external frameworks
 * such as network or UI, following Clean Architecture principles.
 */
data class ExampleModel(
    val name: String,
    val age: Int,
)
