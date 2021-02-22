package functional_manipulation

data class AnotherPerson(val name: String)

fun main() {
    val personList = listOf<AnotherPerson>(
        AnotherPerson("Naveen"),
        AnotherPerson("Taran"),
        AnotherPerson("Greva"),
        AnotherPerson("Rohit"),
        AnotherPerson("Ankit")
    )

    val finalValue: String = giveMeTheListOfNameWithLetterE(personList, ", ") {
        personList.filter { AnotherPerson -> AnotherPerson.name.contains("e") }
    }

    print(finalValue)
}

/**
 * High-order function
 */
fun giveMeTheListOfNameWithLetterE(personList: List<AnotherPerson>, separator: String, lambda: (List<AnotherPerson>) -> List<AnotherPerson>): String {
    val listOfPersonWithE = lambda.invoke(personList)
    return listOfPersonWithE.joinToString(separator){ personName -> personName.name}
}


