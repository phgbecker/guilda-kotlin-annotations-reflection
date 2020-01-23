# Guilda Kotlin - Annotations e Reflection

Conteúdo preparado a partir do capítulo 10 do livro [Kotlin in Action](https://www.manning.com/books/kotlin-in-action)

### Tópicos abordados
- aplicação e definição de Annotations;
- uso de Reflection na instrospeção de classes em tempo de execução;
- um exemplo real de um projeto Kotlin (Biblioteca JKid).

## Annotations

#### Objetivo
Possibilitar a declaração metadados, que personalizam o compartamento de classes, e compiladores.

- Exemplos:
    - @Override (Java): Indica ao compilador a sobreposição de um método de uma superclasse.
    - @Test (JUnit): Indica ao framework na marcação de um método como teste;
    - @Entity (JPA): Indica a quem implementa a API que a classe representa uma entidade;
    - @JsonIgnore (Jackson): Indica ao parser para ignorar propriedades de um Json.
    
#### Sintaxe
- Utilizar: exatamente a mesma do Java;
- Declarar: Um pouco diferente, mas muito semelhante a uma classe.
    ```
    annotation class ToDo(val description: String)
    ```
  
- Exemplos:
    - Especificar uma classe
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
  
#### Alvo das anotações
- Classe;
- Função;
- Propriedade;
- Anotação;
- Construtor;
- Setter;
- Getter.
    
#### Anotações do Kotlin para controlar como expor classes ao Java
- @JvmName: alterar nome de métodos;
- @JvmStatic: expor algo como estático;
- @JvmOverloads: gerar sobrecarga de valores default em métodos;
- @JvmField: alterar a visibilidade de um atributo para público.
    
#### Bonus
- Usando anotações para personalizar a serialização de JSONs: [Projeto JKid](https://github.com/yole/jkid)

## Reflection

#### Definição
Reflexão é uma maneira de acessar propriedades e métodos de objetos dinamicamente,
em tempo de execução, sem saber com antecedência, o que são essas propriedades.

#### Motivações
Em geral o código-fonte de uma aplicação acessa métodos e objetos referenciando declarações específicas,
referencias que o compilador resolve estaticamente garantindo que exista. O que acontece quando precisamos
trabalhar com objetos de qualquer tipo, como em uma biblioteca de serialização JSON?

#### API de reflexão no Kotlin
- Dependência:
    ```
    <groupId>org.jetbrains.kotlin</groupId>
    <artifactId>kotlin-reflect</artifactId>
    ```
    
- Propriedades:
    - KClass: representa uma classe, e permite acesar todas as declarações contidas;
    - KFunction: representa uma função;
    - KProperty: uma representa propriedades;
    - KCallable: permite chamar funções ou getter de propriedades. 
