package se.olapetersson.coolroutines.examples

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock


class CounterExample {
    private val mutex = Mutex()
    var aNumber = 0

    suspend fun increaseCounter() {
        mutex.withLock {
            aNumber++
        }
    }
}

fun main(args: Array<String>) = runBlocking {
    val counterExample = CounterExample()
    (1..10).forEach {
        GlobalScope.launch {
            counterExample.increaseCounter()
        }
    }
}


fun mainWithActor() {
    val counterActor = GlobalScope.actor<Int> {
        var counter = 0 // actor state
        for (msg in channel) { // iterate over incoming messages
            counter += msg
        }
    }
    (1..10).forEach {
        GlobalScope.launch {
            counterActor.send(it)
        }
    }
}

