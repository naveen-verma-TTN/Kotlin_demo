package functional_manipulation

import java.lang.Runnable

/**
 * Java method to run something
 */
object JavaRun {
    fun runNow(runnable: Runnable) {
        runnable.run()
    }
}