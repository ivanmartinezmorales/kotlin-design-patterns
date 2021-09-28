package patterns.creational.factory

class Dog(override val id: Int) : Animal {
    override fun move() {
        println("the dog moved!")
    }

    override fun createSound(): String {
        return "woof!"
    }

}
