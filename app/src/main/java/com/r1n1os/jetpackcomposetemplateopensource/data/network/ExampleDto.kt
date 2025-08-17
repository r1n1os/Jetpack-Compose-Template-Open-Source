package com.r1n1os.jetpackcomposetemplateopensource.data.network

import kotlinx.serialization.Serializable

/**
 * This is an example of Data Transfer Object (DTO) representing the data coming from or sent to the server.
 * */
@Serializable
data class ExampleDto(
    val id: String,
    val name: String,
    val age: Int,
)
