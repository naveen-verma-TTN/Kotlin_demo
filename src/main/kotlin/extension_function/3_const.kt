package extension_function

/**
 * use of "const" in kt and difference between const and val
 */

private class MyClass {
    val value = 2

    // Nested object
    object Constants {
        const val value = 3
    }

    // companion object
    companion object {
        val VAL_VALUE = getMyValue()
        const val CONST_VAL_VALUE = 5

        fun getMyValue(): Int = 4
    }
}

object A {
    const val MY_CONSTANT = 6
}

fun main() {
    val myClass = MyClass()

    // normal val variable
    val value = 1
    println("Local variable: $value")

    //class variable
    println("Class variable: ${myClass.value}")

    // accessing nested object
    println("Nested object: ${MyClass.Constants.value}")

    // accessing companion object
    println("companion object with val: ${MyClass.VAL_VALUE}")

    // accessing companion object
    println("companion object with const val: ${MyClass.CONST_VAL_VALUE}")

    // accessing companion object
    println("object with const val: ${A.MY_CONSTANT}")
}