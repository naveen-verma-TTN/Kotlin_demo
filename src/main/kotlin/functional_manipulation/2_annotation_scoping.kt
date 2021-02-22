package functional_manipulation

import kotlin.reflect.full.declaredMemberProperties

/**
 * Creating targeted annotation
 */

/*
@Target: It targets all the possible kinds of elements which can be annotated with the annotation.
eg:- @Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
*/

@Target(AnnotationTarget.CLASS)
annotation class Table(val name: String)
@Target(AnnotationTarget.PROPERTY)
annotation class Fields(val name: String)

@Table(name = "ContactDetails")
data class Contact(
    val id: Int = 12,
    @Fields(name = "NAME")
    val name: String = "Naveen",
    val phoneNumber: String = "123456789",
    val address: String = "delhi"
) {
    fun toList(): List<Any> {
        return listOf(address, id, name, phoneNumber)
    }
}

fun main() {
    val classObj = Contact::class
    val contact = Contact()

    classObj.declaredMemberProperties.forEachIndexed { index, property ->
        println(property.toString() +" => " + contact.toList()[index])
    }
}