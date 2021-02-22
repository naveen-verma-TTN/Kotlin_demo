package extension_function
/**
 * Learn about pair and triples
 */

fun makePair() {
    val myPair: Pair<String, String> = "fish net" to "catching fish"
    println("${myPair.first} used for ${myPair.second}")
}

fun makeTriple() {
    val mytriple: Triple<String, Int, Int> = Triple("2 X 3", 2, 3)
    println("${mytriple.first} = ${mytriple.second * mytriple.third}")
    // println("My List: ${mytriple.toList()}")
}

fun makeANestedPair() {
    val myPair: Pair<Pair<String, String>, String> = ("fish net" to "catching fish") to "equipment"
    println("${myPair.first.first} is ${myPair.second}")
    // println("${myPair.first.first} used for ${myPair.first.second}")
}

fun destructurePair() {
    val myPair: Pair<String, String> = "fish net" to "catching fish"
    val (tool, use) = myPair
    println("$tool is used for $use")
}

fun destructureTriple() {
    val myPair: Triple<String, String, String> = Triple("hello", "hi", "yo")
    val (s1, s2, s3) = myPair
    println("$s1 -> $s2 -> $s3")
}

fun main() {
    makePair()
    makeTriple()
    makeANestedPair()
    destructurePair()
    destructureTriple()
}