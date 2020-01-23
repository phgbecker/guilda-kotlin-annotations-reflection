package br.com.contabilizei.guilda.kotlin.reflection

var counter = 0

fun main(args: Array<String>) {
    val kProperty = ::counter

    // Chama um setter usando reflexão, passando 21 como argumento
    kProperty.setter.call(21)

    // Obtem o valor da propriedade chamando o get
    val valorPropriedade = kProperty.get()

    println(valorPropriedade)
}
