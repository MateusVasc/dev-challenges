package org.matt.playlist_management_exercise

import java.time.LocalDateTime

data class Playlist(
    val name: String,
    var musics: MutableList<Music> = mutableListOf<Music>(),
    val createdAt: LocalDateTime = LocalDateTime.now()
)

fun Playlist.addMusic(music: Music) {
    this.musics.add(music)
}

fun Playlist.totalDuration(): String {
    var totalSeconds = 0

    this.musics.forEach { music -> totalSeconds += music.durationInSeconds }

    val totalMinutes = totalSeconds / 60
    totalSeconds %= 60

    val minAns = if (totalMinutes > 9) "$totalMinutes" else "0$totalMinutes"
    val secAns = if (totalSeconds > 9) "$totalSeconds" else "0$totalSeconds"
    return "$minAns:$secAns"
}

fun Playlist.findByGenre(genre: String): List<Music> {
    require(genre.isNotBlank()) { "Genre can't be null or empty" }

    return this.musics.filter { music -> music.genre == genre }
}

fun Playlist.transformTitles(transform: (title: String) -> String): List<String> {
    val ans = mutableListOf<String>()

    this.musics.forEach { music ->
        val transformedTitle = transform(music.title)
        ans.add(transformedTitle)
    }

    return ans
}

