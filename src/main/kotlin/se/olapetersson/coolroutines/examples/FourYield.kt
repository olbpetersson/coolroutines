package se.olapetersson.coolroutines.examples

import kotlinx.coroutines.runBlocking
import se.olapetersson.coolroutines.model.Slice

fun main(args: Array<String>) = runBlocking {
    getPizzaSlices().forEach {
        println("eating pizza slice ${it.index}")
        it.eat()
        Thread.sleep(3000)
    }
}

fun getPizzaSlices() = sequence {
    println("Handing over slices!")
    yield(Slice(1))
    yield(Slice(2))
    yield(Slice(3))
}
