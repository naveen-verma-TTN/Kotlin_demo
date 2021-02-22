package generic

/**
 * in, out, & reified with generic
 */

// Use of "out"
/*class OutDemo<out T>(private val value: T) {
    fun get(): T {
        return value
    }
}

 fun main() {
     val outDemo = OutDemo<String>("To the new") // sub type
     println(outDemo.get())
     val ref: OutDemo<Any> = outDemo // super-type: Referring OutDemo<Any> to its sub-class OutDemo<String>
     println(ref.get())
 }*/

// Use of "in"
/* class InDemo<in T> {
     fun toString(value: T): String {
         return value.toString()
     }
 }

 fun main() {
     val inDemo: InDemo<Any> = InDemo() // Super-type
     println(inDemo.toString("To the new"))
     val ref: InDemo<String> = inDemo   // Sub-type: Referring DemoClass<String> to its Super-Type DemoClass<Any>
     println(ref.toString("To the new"))
 }*/


/**
 * Another example
 */


/*fun main() {
    var a: Container<Dog> = Container<Animal>()
    var b: Container<Animal> = Container<Dog>()
}

open class Animal
class Dog : Animal()
class Container<in T>*/


// use of reified --> Create a reflection on generic

/*inline fun <reified T : Any> get(value: T): String {
    return "\"$value\" is of type " + T::class.simpleName
}

fun main() {
    println(get<String>("hello"))
    println(get<Int>(2))
}*/


//star projection in array
/*fun printArray(array: Array<*>) {
    array.forEach { println(it) }
}

fun main() {
    val name = arrayOf("To", 2, "The", 1.52, "New")
    printArray(name)
}*/
