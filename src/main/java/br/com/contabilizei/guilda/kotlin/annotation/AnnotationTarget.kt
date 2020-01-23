package br.com.contabilizei.guilda.kotlin.annotation

import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.PROPERTY

@Target(CLASS, PROPERTY)
annotation class ToDo(val message: String)

@ToDo("Atualizar versão")
class ContabilizeiSSOClient() {

    @ToDo("Migrar para 2.0")
    var versao: String = "1.0"
}