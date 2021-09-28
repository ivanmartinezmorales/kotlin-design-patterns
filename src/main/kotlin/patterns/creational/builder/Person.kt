package patterns.creational.builder

import java.util.*

/**
 * The builder pattern is a creational design pattern
 * that allows you to build objects of any size, step
 * -by-step. The pattern allows for the production of
 * different types and representations of an object
 * while using the same constructor code.
 *
 * In Kotlin, we can't pass nulls into our constructor.
 * Kotlin is huge on null-safety and doing so means that
 * we need to wire up our constructors with this in mind.
 *
 * With constructors that have tons of optional arguments,
 * it is wise to use the builder pattern here because we
 * can customize exactly how we want the class to behave
 * based on the inputs that we provide.
 *
 * We can create a builder pattern fairly easily in Kotlin,
 * by using default parameters in our constructors. Another
 * approach that we can use is through fluent setters. Fluent
 * setters allow for the order of constructor parameters to
 * be arbitrary, and it's cleaner. Optional fields that we
 * needed previously are no longer needed which is a huge win.
 */

class Person private constructor(
    val firstName: String,
    val lastName: String,
    val emailAddress: String?,
    val age: Int?,
    val birthday: Date?,
) {

    data class Builder (
        var firsName: String,
        var lastName: String,
        var emailAddress: String? = null,
        var age: Int? = null,
        var birthday: Date? = null,
    ) {
        fun withEmailAddress(emailAddress: String) = apply {
            this.emailAddress = emailAddress
        }

        fun withAge(age: Int) = apply {
            this.age = age
        }

        fun withBirthday(birthday: Date) = apply {
            this.birthday = birthday
        }

        fun build() = Person(firsName, lastName, emailAddress, age, birthday)
    }
}
