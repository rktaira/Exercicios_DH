package `15-InlineFunction`

//Funções estendidas podem ser criadas para trabalhar variáveis
//No exemplo abaixo é criada uma função estendida para as Strings.
//Com isso, todas as strings podem usar essa função.

fun String.retornaPrimeiras3Letras(): String{
    return this.substring(0,3)
}

fun main() {
    val nome = "nome aleatório"
    val primeirasLetras = nome.retornaPrimeiras3Letras()

    println(primeirasLetras)
}