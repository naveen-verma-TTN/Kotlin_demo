package functional_manipulation

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

/**
 * Functional manipulation - annotations
 */

/**
 * listing down the function
 */

annotation class ImAPlant
annotation class ImNotAPlant

@ImAPlant
class Plant {
    fun trim(){}
    fun fertilize(){}
}

fun testAnnotations() {
    val classObj = Plant::class
    for(m in classObj.declaredMemberFunctions) {
       println(m.name)
    }
}

/**
 * listing down the annotations
 */
/*fun testAnnotations() {
    val classObj = Plant::class
    for(m in classObj.annotations) {
        println(m.annotationClass.simpleName)
    }
}*/

/**
 * find if the classObj is annotated with specific annotation or not
 */
/*fun testAnnotations() {
    val classObj = Plant::class

    val annotationObj = classObj.findAnnotation<ImAPlant>() // return @Package_name.annotation

//    val annotationObj = classObj.findAnnotation<ImNotAPlant>() // return null
    print(annotationObj)
}*/

fun main() {
    testAnnotations()
}



