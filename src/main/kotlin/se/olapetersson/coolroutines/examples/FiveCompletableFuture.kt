package se.olapetersson.coolroutines.examples

import se.olapetersson.coolroutines.PizzaService
import java.lang.Thread.sleep

fun main(args: Array<String>) {
    val pizzaService = PizzaService()
    pizzaService.getPizzaAsync()
        .thenApplyAsync { pizza ->
            pizzaService.slicePizzaAsync(pizza)
                .thenAccept { slices ->
                    slices.forEach {
                        pizzaService.eatSliceAsync(it)
                            .thenAccept {
                                println("Ate slices!")
                            }
                    }
                }
        }
    sleep(2000)
}
