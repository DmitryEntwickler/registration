package de.emgress.registration.screens.homeScreen.dtos

import kotlinx.serialization.Serializable

@Serializable
data class WeatherDTO(
    val weather: List<WeatherItem>,
    val sources: List<Source>
)
