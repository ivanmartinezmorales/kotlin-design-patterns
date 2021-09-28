package patterns.creational.singleton

class SingletonImpl {
    private var count: Number = 0

    fun incrementSingletonCounter() {
        for (i in 1..10) {
            count = Singleton.increment()
        }

        println("The count is $count")
    }
}