package de.emgress.registration.screens.homeScreen.dtos

import kotlinx.serialization.Serializable

@Serializable
data class Source(
    val id: Int,
    val dwd_station_id: String? = null,
    val observation_type: String,
    val lat: Double,
    val lon: Double,
    val height: Double,
    val station_name: String,
    val wmo_station_id: String? = null,
    val first_record: String,
    val last_record: String,
    val distance: Double
)
