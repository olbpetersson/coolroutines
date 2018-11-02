package se.olapetersson.coolroutines

import se.olapetersson.coolroutines.model.Pizza
import se.olapetersson.coolroutines.model.Slice
import java.util.concurrent.CompletableFuture

class PizzaService {

    // Move to coroutine service
    suspend fun getPizza(): Pizza {
        return Pizza()
    }

    suspend fun slicePizza(pizza: Pizza): List<Slice> {
        return pizza.slices
    }

    suspend fun eatSlice(slice: Slice) {
        slice.eat()
    }

    fun getPizzaAsync(): CompletableFuture<Pizza> {
        return CompletableFuture.completedFuture(Pizza())
    }

    fun eatSliceAsync(slice: Slice): CompletableFuture<Unit> {
        return CompletableFuture.completedFuture(Unit)
    }

    fun slicePizzaAsync(pizza: Pizza): CompletableFuture<List<Slice>> {
        return CompletableFuture.completedFuture(pizza.slices)
    }
}
