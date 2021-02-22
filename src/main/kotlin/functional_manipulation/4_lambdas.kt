package functional_manipulation

/**
 * Simple lambda function
 */
/*fun main() {
    val myLambda: (Int) -> Double = { value: Int -> value * 2.5 }
    print(myLambda(3))
}*/

/**
 * Another example
 */
data class Person(var name: String)

fun main() {
    val personList = listOf<Person>(
        Person("Naveen"),
        Person("Taran"),
        Person("Greva"),
        Person("Rohit"),
        Person("Ankit")
    )

    val personWithLetterE: List<Person> =
        personList.filter { person -> person.name.contains("e") }
    print(personWithLetterE)
}


