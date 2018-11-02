package se.olapetersson.coolroutines.model

class Slice(val index: Int, var isEaten: Boolean = false) {
    fun eat() {
        isEaten = true
    }
}
