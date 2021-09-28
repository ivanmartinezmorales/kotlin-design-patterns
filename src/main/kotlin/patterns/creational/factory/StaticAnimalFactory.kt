package patterns.creational.factory

/**
 * Since there is no static keyword in Kotlin, we can use
 * a companion object to declare members that do not belong
 * to the instance of the class, but rather to the class itself.
 *
 * There are certain advantages to the static factory method.
 * The biggest being that it provides a clear definition for the
 * constructor, and what the constructor expects, and even what it
 * provides.
 *
 * When we declare the companion object keyword, the object no
 * longer needs to be instantiated before the methods within
 * the object can be used. This is pretty similar to the way that
 * static methods work.
 */
class StaticAnimalFactory {
    companion object {
        fun animalFrom(animalName: String): Animal {
            return AnimalFactory().createAnimal(animalName)
        }
    }
}