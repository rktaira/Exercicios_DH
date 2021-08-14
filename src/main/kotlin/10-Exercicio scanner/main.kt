package `10-Exercicio scanner`

import java.util.*

/*Exercício
1) Crie uma classe chamada Ingresso que possui um valor em reais, valor que deve
ser definido na própria classe Ingresso, e uma função imprimeValor(). A classe
Ingresso não poderá ser instanciada.
2) Crie uma classe IngressoVip, que herda de Ingresso e possui um valor adicional.
Sobrescreva a função imprimeValor(), para que faça a impressão do valor do
ingressoVip, que é acrescido de um adicional e concatenado com o texto: “Ingresso
Vip”.
3) Crie uma classe IngressoPadrão, que herda de Ingresso e sobrescreva a função
imprimeValor(), exibindo um valor original e concatenada com o texto: "Ingresso
Padrão".
Crie um arquivo de Bilheteria com a função main e:
● Pergunte ao usuário qual o ingresso desejado. O usuário
deve digitar 1 para padrão e 2 para VIP. Conforme a escolha
do usuário, faça a impressão do ingresso escolhido.*/

fun main() {
    var vip = IngressoVip(50.00f)
    var padrao = IngressoPadrao(35.00f)
    val scanner = Scanner(System.`in`)

    println("""Olá! Qual ingresso gostaria de comprar?
        |1 - Ingresso padrão: R$${padrao.valor}
        |2 - Ingresso VIP: R$${vip.valor}
    """.trimMargin()
    )
    var escolha = scanner.nextInt()

    if (escolha==1) {
        padrao.imprimeValor()
    }; if (escolha==2){
        vip.imprimeValor()
    }

}