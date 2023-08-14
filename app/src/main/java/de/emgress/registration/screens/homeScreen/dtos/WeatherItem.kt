package de.emgress.registration.screens.homeScreen.dtos

import kotlinx.serialization.Serializable

@Serializable
data class WeatherItem(
    val timestamp: String,
    val source_id: Int,
    val precipitation: Double,
    val pressure_msl: Double,
    val sunshine: Double? = null,
    val temperature: Double,
    val wind_direction: Int,
    val wind_speed: Double,
    val cloud_cover: Int,
    val dew_point: Double,
    val relative_humidity: Int,
    val visibility: Int,
    val wind_gust_direction: Int,
    val wind_gust_speed: Double,
    val condition: String,
    val precipitation_probability: Double? = null,
    val precipitation_probability_6h: Double? = null,
    val solar: Double,
    val fallback_source_ids: Map<String, String> = emptyMap(),
    val icon: String
)
