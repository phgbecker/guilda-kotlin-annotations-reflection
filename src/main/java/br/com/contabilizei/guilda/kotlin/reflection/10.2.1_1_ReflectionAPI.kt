package br.com.contabilizei.guilda.kotlin.reflection

import kotlin.reflect.full.memberProperties

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("Alice", 29)

    // Recupera a instancia de uma KClass<Person>
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)

    // Coleta todas as propriedades da classe
    val memberProperties = kClass.memberProperties

    memberProperties.forEach { println(it.name) }
}
