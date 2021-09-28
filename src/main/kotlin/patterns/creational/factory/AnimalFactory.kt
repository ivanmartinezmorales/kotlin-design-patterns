package patterns.creational.factory

/**
 * The Factory method is a creational design pattern
 * that provides an interface for creating objects in
 * a superclass, but allows subclasses to alter the
 * type of objects that will be created.
 */
class AnimalFactory {
    var animalCounter: Int = 0

    fun createAnimal(animalType: String): Animal {
        return when(animalType.trim().toLowerCase()) {
            "cat" -> Cat(++animalCounter)
            "dog" -> Dog(++animalCounter)
            else -> throw InvalidAnimalException("Unknown animal")
        }
    }
}