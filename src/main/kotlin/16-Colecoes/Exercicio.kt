package `16-Colecoes`

/*
Collections - exercícios
1. Criar um dicionário que represente os primeiros 5 números da “Loteria dos
Sonhos”, junto com seu significado. Para isso, o dicionário deverá ter como
chave Int e como valor uma String. Crie uma função para printar a lista, chave e valor um ao lado
do outro.
Números da Loteria dos Sonhos:
0 → Ovos
1 → Água
2 → Escopeta
3 → Cavalo
4 → Dentista
5 → Fogo
*/

fun main() {
    val loteria = mapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")
    loteria.forEach {
        println("${it.key} -> ${it.value}")
    }
//Mesmo exercicio feito de outra forma
//    for ((chave, valor) in loteria) {
//        println("$chave -> $valor")
//    }


//  Função para se quisesse encontrar uma chave de acordo com o valor
//        loteria.forEach{
//            if (it.value == "Cavalo") {
//                println(it.key) }}


/*
2. Criar um dicionário que represente os apelidos que uso para chamar os
meus amigos. Para isso, o dicionário deverá ter como chave String e como
valor uma lista de Strings. Crie uma função para printar a lista, chave e valor.
João → Juan, El Divo, Maromba, Zé Bonitinho
Miguel → Dark Knight, Bruce Wayne, Batfleck, Gengiva
Maria → Ju, Mary, Marilene, Ventania
Lucas → Lukinha, Jorge, George, Kevin Flynn
Collections - exercícios
*/
    val apelidos = mapOf(
        "João" to listOf("Juan", "El Divo", "Maromba", "Zé Bonitinho"),
        "Miguel" to listOf("Dark Knight", "Bruce Wayne", "Batfleck", "Gengiva"),
        "Maria" to listOf("Ju", "Mary", "Marilene", "Ventania"),
        "Lucas" to listOf("Lukinha", "Jorge", "George", "Kevin Flynn")
    )
    apelidos.forEach {
        println("${it.key} -> ${it.value}")
    }
/*
3. Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à lista vazia:
1,5,5,6,7,8,8,8. Imprimir o resultado na tela.
*/
    val lista = mutableListOf<Int>()
    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)
    println(lista)

/*  4. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos ao
    conjunto vazio: 1,5,5,6,7,8,8,8. Imprimir o resultado na tela. Qual é a diferença entre este
    exercício e o anterior? */

    val conjunto = mutableSetOf<Int>()
    conjunto.add(1)
    conjunto.add(5)
    conjunto.add(5)
    conjunto.add(6)
    conjunto.add(7)
    conjunto.add(8)
    conjunto.add(8)
    conjunto.add(8)
    println(conjunto)

/*  5. Crie a função somaTotal(Set<Int>) , a função deve percorrer o conjunto de inteiros, ir
    acumulando o total da soma dos valores e, no final, imprimir na tela o valor da soma
    total. */

    fun somaTotal(conj: Set<Int>): Int {
        var soma: Int = 0
        conj.forEach {
            soma += it
        }
        return soma
    }
    println(somaTotal(conjunto))
}