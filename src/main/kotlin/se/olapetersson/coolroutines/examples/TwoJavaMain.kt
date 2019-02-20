package se.olapetersson.coolroutines.examples

import kotlin.concurrent.thread

// 1. It will finish in about 1 second
// 2. It will never finish

fun main(args: Array<String>) {
    val threads = (1..1_000_000).map {
        thread {
            Thread.sleep(5000L)
        }
    }
    threads.forEach { it.join() }
    println("Finished with threads")
}
