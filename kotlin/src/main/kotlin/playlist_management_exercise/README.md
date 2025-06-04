# Kotlin Challenge: Music Playlist System

![Difficulty](https://img.shields.io/badge/difficulty-intermediate-yellow)

A practical exercise to learn Kotlin's idiomatic features by implementing a music playlist manager.

## Learning Objectives

Through this challenge, I practiced:

### Core Kotlin Features
✔️ Data classes  
✔️ Null safety  
✔️ Extension functions  
✔️ Higher-order functions  
✔️ Property accessors

### Additional Concepts
✔️ Immutability patterns  
✔️ Operator overloading  
✔️ Scope functions (`apply`, `run`)  
✔️ String formatting  
✔️ Collection operations

## Challenge Structure

### Part 1: Data Modeling
1. Created `Music` data class with:
    - Non-null properties (title, artist, duration)
    - Nullable genre property
    - Default values for flexibility

2. Created `Playlist` data class with:
    - Mutable collection of songs
    - Creation timestamp
    - Methods for playlist manipulation

### Part 2: Core Functionality
Implemented:
1. **Duration Calculation**
    - Sum all songs' duration
    - Format as MM:SS
    - Used extension function and property accessor versions

2. **Genre Filtering**
    - Handle null genres safely
    - Case-insensitive comparison
    - Validation for empty inputs

3. **Title Transformation**
    - Higher-order function that accepts transformation lambda
    - Used `map` for clean collection transformation

### Part 3: Advanced Features
1. **Operator Overloading**
    - Implemented `plus` operator for adding songs
    - Enables clean syntax: `playlist + song`

2. **Builder Pattern**
    - Used `apply` scope function for fluent initialization
    - Alternative immutable version with `copy()`

3. **Sealed Classes**
    - Experimental implementation of different playlist types
    - Demonstrates Kotlin's type system power

## Code Examples

### Creating a Playlist
```kotlin
val playlist = Playlist("My Favorites").apply {
    addMusic(Music("Bohemian Rhapsody", "Queen", 354, "Rock"))
    addMusic(Music("Clair de Lune", "Debussy", 302))
}