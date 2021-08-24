package `14-LambdaExercicios`

fun main() {
println("====== Exercício 1 ======")

//  1 - Crie 4 funções lambdas para as operações de matemática básica: soma,
//  subtração, multiplicação e divisão. Cada lambda receberá 2 parâmetros para
//  realizar as operações.
//  Crie uma função Main e execute-as, printando os resultados.
    val soma = {a: Int, b: Int -> a+b}
    val subtrai = {a: Int, b: Int -> a-b}
    val multiplica = {a:Int, b: Int -> a*b}
    val divide = {a:Double, b:Double -> a/b}
//    val dividir: (Int, Int) -> Double = {a, b -> a/b}

    println("""soma: ${soma(10,15)}
sub. : ${subtrai(10,15)}
mult.: ${multiplica(10, 2)}
div.: ${divide(15.0, 10.0)}""")


//    2 - Crie uma função lambda que receba um e-mail e valide-o para saber se está
//    conforme as regras básicas. Para cumprir a regra básica principal, o mesmo deve
//    conter um @. OBS. essa função deve retornar true ou false, ok? =)
//    Execute-o na função Main, printando o resultado
    println("""
        |
        |======= Exercício 2 ========""".trimMargin())

    val verificaEmail: (String) -> Boolean = {it.contains("@")}
    println(verificaEmail("asdf@hotmail.com"))
    println(verificaEmail("asdf2hotmail.com"))

//    3 - Crie uma função lambda que receba uma List<Int> e calcule e retorne o
//    produto dos itens contidos na mesma.
//    Execute-o na função Main, printando o resultado.
    println("""
        |
        |======= Exercício 3 ========""".trimMargin())

    var multLista: (List<Int>) -> Int = {
        var mult = 1
        for (i in it) {
            mult=mult*i
        }
        mult
    }
    println(multLista (listOf(1,2,3,4,5)))

}