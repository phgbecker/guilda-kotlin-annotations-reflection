package br.com.contabilizei.guilda.kotlin.reflection

fun foo(x: Int) = println(x)

fun main(args: Array<String>) {

    // Recupera a função via reflexão
    val kFunction = ::foo

    // Executa chamada a função "foo" via reflexão
    kFunction.call(42)
}
