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


/**
 * let
 * run
 * also
 * apply
 * with
 */

/**
 * let takes the object it is invoked upon as the parameter and returns the result of the lambda expression.
 * Kotlin let is a scoping function wherein the variables declared inside the expression cannot be used outside.
 */

/*fun main() {
    val s = "hi guys"
    val strLength = s.let { it.length + 3 }
    println("Length is $strLength")
}*/

/**
 * Similar to the let function, the run function also returns the last statement.
 * Unlike let, the run function does’t support the it keyword.
 */

/*fun main() {
    val s = "hi guys"
    val strLength = run {
        val s2 = "bye guys"
        s2.length + 3 }
    println("Length is $strLength")
}*/

/**
 * As the name says, also expressions does some additional processing on the object it was invoked.
 * Unlike let, it returns the original object instead of any new return data. Hence the return data has always the same type.
 */

/*fun main() {
    data class OtherPerson(var name: String, var tutorial : String)
    val person = OtherPerson("naveen", "Kotlin")

    val l = person.let { it.tutorial = "Android" }
    val al = person.also { it.tutorial = "Android" }

    println(l)
    println(al)
    println(person)
}*/

/**
 * Kotlin apply is an extension function on a type. It runs on the object reference (also known as receiver)
 * into the expression and returns the object reference on completion.
 */

/*fun main() {
    data class Person(var n: String, var t : String)
    val person = Person("naveen", "Kotlin")

    person.apply { t = "Swift" }
    println(person)

    person.also { it.t = "Kotlin" }
    println(person)
}*/

/**
 * Like apply, with is used to change instance properties without the need to call dot operator over the reference every time.
 */

/*fun main() {
    data class Person(var name: String, var tutorial : String)
    val person = Person("naveen", "Kotlin")

    with(person)
    {
        name = "Taran"
        tutorial = "Android tutorials"
    }

    print(person)
}*/


