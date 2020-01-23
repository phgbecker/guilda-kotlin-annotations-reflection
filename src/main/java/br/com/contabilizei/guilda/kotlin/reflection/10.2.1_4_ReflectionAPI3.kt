package ch10.ex2_1_4_ReflectionAPI3

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("Alice", 29)

    // Armazena a referência da propriedade
    val memberProperty = Person::age

    // Obtem o valor da instância da propriedade
    val valorPropriedade = memberProperty.get(person)
    println(valorPropriedade)
}
