package functional_manipulation


/**
 * Working with Single Abstract Methods (SAMs)
 */

fun runThis() {
    // First Method
    val runObj = Runnable { println("I'm a Runnable") }
    JavaRun.runNow(runObj)

    // Second Method
    JavaRun.runNow {
        println("I'm a Runnable")
    }
}

fun main() {
    runThis()
}