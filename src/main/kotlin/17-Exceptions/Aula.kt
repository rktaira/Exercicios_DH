package `17-Exceptions`

import java.util.*

fun main() {

//Usando try / catch para tratar valor fora da lista"
    try {
        val numero = listOf(1, 2, 3)
        print(numero[3])
    } catch (erro: ArrayIndexOutOfBoundsException) {
        println(erro.message)
    }

//Usando try/catch para tratar divisão por zero, que é uma "Arithmetic Exception"
    fun dividePorZero() {
        try{
            println(12/0)
        } catch(erro: ArithmeticException) {
            println(erro.message)
        }
    }
    dividePorZero()



    fun recebeNumero(): Int {
        val scanner = Scanner(System.`in`)
        println("digite um numero inteiro")
        try {
            val valorDigitado = scanner.nextInt()
            return valorDigitado
        } catch (erro: InputMismatchException) {
            println("Apenas números inteiros")
            return recebeNumero()
        }
    }

    recebeNumero()
    println("Fim do programa")
}
