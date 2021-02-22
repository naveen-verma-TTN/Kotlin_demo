package functional_manipulation

import java.lang.Thread.sleep

/**
 * Use of outerLoop
 */

fun labels() {
    out@ for (i in 1..10) {
        print("$i ")
         for (j in 1..10) {
            sleep(150)
            if (i > 4) {
                break@out  // breaks to outer loop
            }
            print("*")
        }
        println()
    }
}

fun main() {
    labels()
}