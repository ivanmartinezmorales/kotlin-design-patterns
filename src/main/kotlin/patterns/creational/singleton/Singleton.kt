package patterns.creational.singleton

import java.util.concurrent.atomic.AtomicInteger

/**
 * Singleton pattern is a creational design pattern that
 * ensures that the class has only one instance, while
 * providing a global method of access.
 *
 * The singleton pattern is easily implemented in Kotlin,
 * with the keyword "object" and through object declaration.
 * An object declaration is not an expression, and it cannot
 * be used ont he right-hand side of the assignment
 * statement. It must be called directly.
 */
object Singleton {
    private val counter = AtomicInteger(0)

    init {
        println("I was created for the first time")
    }

    fun increment() = counter.incrementAndGet()
}