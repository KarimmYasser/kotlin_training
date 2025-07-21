fun main() {

}

sealed class Genre {
    object Action : Genre()
    object Comedy : Genre()
    object Drama : Genre()
    object Other : Genre()
}

data class Movie(val title: String, val rating: Double, val genre: Genre) {
    init {
        if (rating < 0 || rating > 10) throw IllegalArgumentException("Rating must be between 0 and 10")
    }

    constructor(title: String) : this(title, 5.0, Genre.Other)

    val reviewSummary: String by lazy {
        when {
            rating >= 8 -> "Excellent"
            rating >= 5 -> "Good"
            else -> "Poor"
        }
    }
}
