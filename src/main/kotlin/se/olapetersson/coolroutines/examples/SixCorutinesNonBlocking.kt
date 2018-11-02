package se.olapetersson.coolroutines.examples

import kotlinx.coroutines.runBlocking
import se.olapetersson.coolroutines.PizzaService

fun main(args: Array<String>) {
    runBlocking {
        val pizzaService = PizzaService()
        val pizza = pizzaService.getPizza()
        val slices = pizzaService.slicePizza(pizza)
        slices.forEach {
            pizzaService.eatSlice(it)
        }
    }
}
