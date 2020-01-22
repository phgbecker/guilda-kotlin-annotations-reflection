# Guilda Kotlin - Annotations e Reflection

Conteúdo preparado a partir do capítulo 10 do livro [Kotlin in Action](https://www.manning.com/books/kotlin-in-action)

## Tópicos abordados

- aplicação e definição de Annotations;
- uso de Reflection para instrospeção de classes em tempo de execução;
- um exemplo real de um projeto Kotlin (Biblioteca JKid).

### Annotations

- Objetivo: Possibilitar a declaração de metadados, utilizados como instrução por classes ou compiladores;
- Exemplos: 
    - @Override (Java): Indica ao compilador a subscrita de um método de uma super classe;
    - @Test (JUnit): Indica ao framework na marcação de um método como teste;
    - @Entity (JPA): Indica a quem implementa a API que a classe representa uma entidade.
    
- Sintaxe
    - Utilizar: exatamente a mesma do Java;
    - Declarar: Um pouco diferente.
    
        - Especificar uma classe: 
        ```
        @RunWith(SpringRunner::class)
        class ObrigacaoFacadeTest()
        ```
        - Especificar outra anotação como argumento: 
        ```
        @Deprecated("Utilizar getBy(ano: Date)", ReplaceWith("getBy(ano)"))
        fun getByAno(ano: Date)
        ```
        - Especificar um array como argumento: 
        ```
        @GetMapping(value = arrayOf("/v1/obrigacao/{id}", "/v2/obrigacao/{id}"))
        fun getObrigacao(@PathVariable id: Long)
        ```

### Reflection

- Estrutura das APIs é semelhante ao Java, porém os detalhes são diferentes.


### Exemplo real de um projeto Kotlin

- Biblioteca de serialização/desserialização de JSON chamda JKid, que trabalha com Reflection para acessar propriedades de objetos Kotlin em tempo de execução, assim como cria objetos a partir de tokens do JSON;
- As Annotations são utilizadas para personalizar o comportamento das classes e propriedades durante a serialização/desserialização;