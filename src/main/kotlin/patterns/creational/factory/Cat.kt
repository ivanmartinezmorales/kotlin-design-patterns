package patterns.creational.factory

class Cat(override val id: Int) : Animal {
    override fun move() {
        println("The cat moved!")
    }

    override fun createSound(): String {
        return "meow!"
    }
}