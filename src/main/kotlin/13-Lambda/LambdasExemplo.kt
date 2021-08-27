package `13-Lambda`

fun main() {

    //Escrevendo como função
    fun soma(a: Int, b: Int): Int {
        return (a + b)
    }
    println(soma(1, 2))

//Três modos de escrever a mesma função como lambda:
    val somaA: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(somaA(10, 2))

    val somaB: (Int, Int) -> Int = { a, b -> a + b }
    println(somaB(11, 3))

    val somaC = { a: Int, b: Int -> a + b }
    println(somaC(12, 4))

//Função do tipo unit
    val somaU: (Int, Int) -> Unit = { a: Int, b: Int -> println(a + b) }
    somaU(13, 5)

//lambda com único parâmetro pode usar palavra "it" para o parâmetro
    val somaI: (Int) -> Unit = { println(it + 10) }
    somaI(10)

    println()
//Exemplo de função maior com lambda
    val listaDePares: (List<Int>) -> Unit = {
        for (item in it) {
            if (item % 2 == 0) {
                println(item)
            }
        }
    }
    listaDePares(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println()

    //Jogando um lambda dentro de uma função
    fun somatoria(a: Int, b: Int, calculador: (Int, Int) -> Int) {
        println(calculador(a, b))
    }
    somatoria(20, 30, somaC)

    val validaEmail: (String) -> Boolean = { email -> email.contains("@") && email.contains(".com") }
    println(validaEmail("asdf@gmail.com"))

}
