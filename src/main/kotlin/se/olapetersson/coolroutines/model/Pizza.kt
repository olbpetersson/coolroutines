package se.olapetersson.coolroutines.model

class Pizza {
    val slices = (1..8).map { Slice(it) }

    fun slicePizza() {
    }

    fun isEaten(): Boolean {
        return slices.all { slice -> slice.isEaten }
    }
}
