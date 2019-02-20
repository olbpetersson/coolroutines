package se.olapetersson.coolroutines.examples

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() {
    coroutineScope {
        launch { }
        launch { throw Exception() }
        async { }
    }
}
