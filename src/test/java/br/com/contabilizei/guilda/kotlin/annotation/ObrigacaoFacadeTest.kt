package br.com.contabilizei.guilda.kotlin.annotation

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.*

class ObrigacaoFacadeTest {

    @Test
    fun `para 2019, deve retornar ECD`() {
        assertThat(
                ObrigacaoFacade().getBy(Date(2019)).first().sigla
        ).isEqualTo(SiglaObrigacao.ECD)
    }

    @Test
    fun `para 2020, deve retornar ECF`() {
        assertThat(
                ObrigacaoFacade().getBy(Date(2020)).first().sigla
        ).isEqualTo(SiglaObrigacao.ECF)
    }

}