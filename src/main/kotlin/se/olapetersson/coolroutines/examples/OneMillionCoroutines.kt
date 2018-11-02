package se.olapetersson.coolroutines.examples

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val jobs = (1..1_000_000).map {
        GlobalScope.launch {
            delay(1000)
        }
    }

    jobs.joinAll()
    println("Finished ${jobs.size} coroutines")
}
