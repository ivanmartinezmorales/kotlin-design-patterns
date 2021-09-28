package patterns.creational.factory

interface Animal {
    // The ID of the animal as it is created
    val id: Int

    fun move()

    fun createSound(): String
}