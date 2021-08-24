package `15-InlineFunction`

inline fun repeatPrint(funcao: () -> Unit){
    var contador = 0
    do{
        funcao()
        contador++
    } while(contador <= 10)
}

fun printar() {println("teste")}

fun main() {
    repeatPrint {printar()}
}

//Usar inline quando uma função receber outra função como parâmetro.
//A vantagem é usar menos memória, principalmente se as funções parâmetros forem pequenas