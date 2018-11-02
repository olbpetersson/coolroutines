package se.olapetersson.coolroutines

class DynamoFakeClient {

    fun putItem(id: Int): DatabaseResult {
        Thread.sleep(1000L)
        return DatabaseResult()
    }
}

class DatabaseResult {
    fun isSuccessful(): Boolean {
        return true
    }
}
