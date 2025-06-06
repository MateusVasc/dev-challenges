package playlist_management

import org.matt.playlist_management_exercise.Music
import org.matt.playlist_management_exercise.Playlist
import org.matt.playlist_management_exercise.addMusic
import org.matt.playlist_management_exercise.totalDuration
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertNotNull

class PlaylistUnitTests {
    @Test
    fun `Should add music to playlist successfully`() {
        // Given
        val mockMusic = Music("Lovely", "Billie Eilish", 201, "Pop")
        val mockPlaylist = Playlist("Pop Playlist")
        val sizeBeforeMock = mockPlaylist.musics.size

        // When
        mockPlaylist.addMusic(mockMusic)

        // Then
        assert(mockPlaylist.musics.size == sizeBeforeMock + 1)
        assertNotNull(mockPlaylist.musics)
        assertContains(mockPlaylist.musics, mockMusic)
    }

    @Test
    fun `Should return the total duration of a playlist successfully for many musics`() {
        // Given
        val mockMusic = Music("Lovely", "Billie Eilish", 201, "Pop")
        val mockMusic2 = Music("Blinding Lights", "The Weeknd", 200, "Synthwave")
        val mockMusic3 = Music("Bohemian Rhapsody", "Queen", 354, "Rock")
        val mockPlaylist = Playlist("Pop Playlist", mutableListOf(mockMusic, mockMusic2, mockMusic3))

        // When
        val totalDuration = mockPlaylist.totalDuration()

        // Then
        assert(totalDuration == "12:35")
    }

    @Test
    fun `Should return the total duration of a playlist successfully for one music`() {
        // Given
        val mockMusic = Music("Lovely", "Billie Eilish", 201, "Pop")
        val mockPlaylist = Playlist("Pop Playlist", mutableListOf(mockMusic))

        // When
        val totalDuration = mockPlaylist.totalDuration()

        // Then
        assert(totalDuration == "03:21")
    }

    @Test
    fun `Should return zero as total duration for a empty playlist`() {
        // Given
        val mockPlaylist = Playlist("Pop Playlist")

        // When
        val totalDuration = mockPlaylist.totalDuration()

        // Then
        assert(totalDuration == "00:00")
    }
}