package functional_manipulation

/**
 *
 */
fun main() {
    val personList = listOf<Person>(
        Person("Naveen"),
        Person("Taran"),
        Person("Greva"),
        Person("Rohit"),
        Person("Ankit")
    )

    /**
     * As the myWith function is inline..so,
     *
     * myWith(personList) {
     *   capitalize()
     * }
     *
     * will behave like
     *
     * personList.capitalize()
     *
     * at compile-time
     */
    val names = myWith(personList) { capitalize() }

    print(names)
}

inline fun myWith(personList: List<Person>, function: String.() -> String) = personList.onEach { person ->
    person.apply {
        name = name.function()
    }
}.joinToString(", ") { it.name }


fun String.capitalize(): String {
    return this.substring(0,1).toLowerCase() +
            this.substring(1,2).toUpperCase() +
            this.substring(2).toLowerCase()
}
