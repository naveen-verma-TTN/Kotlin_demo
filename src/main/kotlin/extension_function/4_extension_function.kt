package extension_function

/**
 * Used of Extension function
 */


// normal function
fun spaces(value: String): Boolean {
    val found = value.find { it == ' ' }
    return found != null
}


// extension function
fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}


/* fun main() {
     val string: String = "Hello bye"

     // calling a normal function
     println("Normal function: ${spaces(string)}")

     // calling an extension function
     println("Extension function: ${string.hasSpaces()}")
 }*/


/**
 * limiting extension
 */

/* class AquariumPlant(val color: String, private val size: Int)

 fun AquariumPlant.isRed(): Boolean {
     return color == "red"
 }
 fun AquariumPlant.isBig(): Boolean {
     return size > 50 // we can't access size as size is declared private
 }    */


/**
 * Another example
 */
open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
/* fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun main() {
    val plant = GreenLeafyPlant(20)
    plant.print()

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
}*/

/**
 * Extension Property
 */

/*val AquariumPlant.isGreen: Boolean
    get() {
        println("Color: ${this.color}")
        return color == "green"
    }


// nullable receivers
 fun AquariumPlant?.pull() {
     this?.apply {
         println(this.color)
     } ?: println("Null found")
  }

fun main() {
    val plant = GreenLeafyPlant(20)

    val aquariumPlant: AquariumPlant = plant

    println("isGreen: ${aquariumPlant.isGreen}")
    val plant1: AquariumPlant? = null
    plant1.pull()
}*/
