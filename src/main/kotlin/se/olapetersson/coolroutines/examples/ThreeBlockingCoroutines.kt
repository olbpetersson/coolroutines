package se.olapetersson.coolroutines.examples

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import se.olapetersson.coolroutines.DynamoFakeClient
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) = runBlocking {
    val time = measureTimeMillis {
        val dynamoClient = DynamoFakeClient()
        val jobs = (1..32).map {
            GlobalScope.launch {
                //
                dynamoClient.putItem(it)
            }
        }
        jobs.joinAll()
        println("Finished ${jobs.size} coroutines")
    }
    println("Executed in $time")
}
