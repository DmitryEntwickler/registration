package de.emgress.registration.screens.homeScreen.dtos

import kotlinx.serialization.Serializable

@Serializable
data class KrimiAuthorDTO(
    val id: String,
    val vorname: String,
    val name: String,
    val pseudonym: String,
    val von: String,
    val bis: String,
    val land: String,
    val genre: String
)
