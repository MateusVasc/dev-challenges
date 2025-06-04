package org.matt.playlist_management_exercise

data class Music(
    val title: String,
    val artist: String,
    val durationInSeconds: Int,
    val genre: String? = null
)
