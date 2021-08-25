package `15-InlineFunction`

import java.util.*

//6) Crie um arquivo chamado Utils (para funções de utilidades
//genéricas) e as funções dos exercicios que fechamentoDeConta()
//receberá, você deverá cria-los no arquivo Utils.
//7) A primeira função será cabecalhoDoComprovante(), que não
//receberá parametros e apenas fará a impressão do template abaixo:
//##########DH SuperMarket##########

val cabecalhoDoComprovante:() -> Unit = {
    println("##########DH SuperMarket##########")
}

//8) A segunda função que fechamentoDeConta() receberá, será a
//função dataDaCompra(), que também não receberá parametros e
//retornará a data atual (String) formatada em dia/mes/ano, utilizando
//a classe Calendar.

val dataDaCompra:() -> Unit = {
    var data = Calendar.getInstance()
    println("Data: ${data.get(Calendar.DATE)}/${data.get(Calendar.MONTH)}/${data.get(Calendar.YEAR)}")
}

//9) A terceira função que fechamentoDeConta() receberá, será a
//função imprimeListaDeCompra, que receberá como parametro a
//lista de itens e fará a impressão dos mesmos, usando println() para
//cada item da lista, através do laço de repetição for.

val imprimirListaDeCompra: (CarrinhoDeCompras) -> Unit = {
    for(i in it.lista) {
        println("${i.nome} R$${i.preco}")
    }
}

//10) E a quarta e última função será a função adicionaRodape(), que
//receberá a lista de produtos e fará a somatória total, exibindo a ao
//fim do calculo.

val adicionarRodape: (CarrinhoDeCompras) -> Unit = {
    var soma: Double = 0.00
    for (Produto in it.lista) {
        soma += Produto.preco}
    println("Total: R$$soma")
    }