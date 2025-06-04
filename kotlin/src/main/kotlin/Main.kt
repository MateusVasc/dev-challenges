package org.matt

import org.matt.playlist_management_exercise.Music
import org.matt.playlist_management_exercise.Playlist
import org.matt.playlist_management_exercise.addMusic
import org.matt.playlist_management_exercise.findByGenre
import org.matt.playlist_management_exercise.totalDuration
import org.matt.playlist_management_exercise.transformTitles
import java.time.LocalDateTime

fun main() {
    // Music Playlist Challenge
    // 1. Creates some musics
    val music1 = Music("Bohemian Rhapsody", "Queen", 354, "Rock")
    val music2 = Music("Shape of You", "Ed Sheeran", 234, "Pop")
    val music3 = Music("Clair de Lune", "Debussy", 302, null)

    // 2. Creates a playlist and adds musics
    val myPlaylist = Playlist("Minhas Favoritas", mutableListOf(), LocalDateTime.now())
    myPlaylist.addMusic(music1)
    myPlaylist.addMusic(music2)
    myPlaylist.addMusic(music3)

    // 3. Tests the functions
    println("Duração total: ${myPlaylist.totalDuration()}")

    println("Músicas de Rock: ${myPlaylist.findByGenre("Rock")}")

    val titulosMaiusculos = myPlaylist.transformTitles { it.uppercase() }
    println("Títulos em maiúsculo: $titulosMaiusculos")

    // 4. Initialization with aaply
    val anotherPlaylist = Playlist("Workout").apply {
        addMusic(Music("Eye of the Tiger", "Survivor", 245, "Rock"))
        addMusic(Music("Stronger", "Kanye West", 312, "Hip-Hop"))
    }
    println(anotherPlaylist)

    // #########################################################################
}