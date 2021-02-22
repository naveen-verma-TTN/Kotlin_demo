package extension_function
/**
 * demo for collection
 */

fun main() {
    val list = listOf(1, 2, 3, 4, 5)


    // to sum array of number
    println("Sum: ${list.sum()}")

    // to sum array of strings
    // var list2 = listOf("a","bbb","ccc")
    // println("Sum: ${list2.sum()}")

    // use of sumBy
    // println("sum: ${list2.sumBy { it.length }}") 

    // simple itrator
    // for (s in list2.listIterator()) {
    //     println("$s ")
    // }

    //creating a hashMap
    // val map = hashMapOf("cricket" to "11 players","basketball" to "5 player", "chess" to "2 player")
    // println(map.get("basketball")?:"empty") 
    // or
    // println(map["basketball"]) 
    // or
    // println(map.getOrDefault("football", "empty"))
    // or
    // println(map.getOrElse("football") {"empty"})

    //creating mutable map
    // val map = mutableMapOf("fish" to 1)
    // map.put("tank", 3)
    // println(map.toString())
    // map.remove("fish")
    // println(map.toString())

}