package br.com.contabilizei.guilda.kotlin.annotation

import br.com.contabilizei.guilda.kotlin.annotation.SiglaObrigacao.ECD
import br.com.contabilizei.guilda.kotlin.annotation.SiglaObrigacao.ECF
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.*

class ObrigacaoFacadeTest {

    @Test
    fun `para 2019, deve retornar ECD`() {
        assertThat(
                ObrigacaoFacade().getByAno(Date(2019)).first().sigla
        ).isEqualTo(ECD)
    }

    @Test
    fun `para 2020, deve retornar ECF`() {
        assertThat(
                ObrigacaoFacade().getByAno(Date(2020)).first().sigla
        ).isEqualTo(ECF)
    }

}