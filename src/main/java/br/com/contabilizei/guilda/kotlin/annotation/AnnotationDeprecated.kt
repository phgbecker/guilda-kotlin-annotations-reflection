package br.com.contabilizei.guilda.kotlin.annotation

import java.util.*

data class Obrigacao(
        val ano: Date,
        val sigla: SiglaObrigacao
)

enum class SiglaObrigacao {
    ECD,
    ECF
}

class ObrigacaoRepository() {
    fun get(): List<Obrigacao> = listOf(
            Obrigacao(ano = Date(2019), sigla = SiglaObrigacao.ECD),
            Obrigacao(ano = Date(2020), sigla = SiglaObrigacao.ECF)
    )
}

class ObrigacaoFacade() {

    @Deprecated("Utilizar getBy(ano: Date)", ReplaceWith("getBy(ano = ano)"))
    fun getByAno(ano: Date) = ObrigacaoRepository().get().filter { it.ano.compareTo(ano) == 0 }

    fun getBy(ano: Date) = ObrigacaoRepository().get().filter { it.ano.compareTo(ano) == 0 }
}

