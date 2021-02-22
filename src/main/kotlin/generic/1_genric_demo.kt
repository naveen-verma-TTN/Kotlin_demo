package generic

/**
 * Simple Generic Example
 */
class MyGenericClass<T> (private val value: T) {
    init{
        if(value is Demo) {
            (value as Demo).print()
        }
        else {
            println("\"$value\" of ${value!!::class.simpleName}")
        }
    }
}

class Demo {
    fun print() {
        println("This is kt demo class")
    }
}

fun main() {

    // MyGenericClass of String type
    MyGenericClass<String>("To the New")

    // MyGenericClass of Int type
    MyGenericClass<Int>(2)

    // MyGenericClass of float type
    MyGenericClass<Float>(2.5F)

    // MyGenericClass of Demo type
    MyGenericClass<Demo>(Demo())
    // or we can remove the angle brackets as Kotlin has type inference 
    // MyGenericClass(Demo())

    // ---> what if i pass null?
    // MyGenericClass(null)
}