package `15-InlineFunction`

//1) Vamos começar modelando a classe Produto, o produto terá um
//nome (String) e um preço (Double).

data class Produto(val nome: String, val preco: Double)

//2) Modele a classe CarrinhoDeCompras(), essa classe terá uma lista,
//do tipo ArrayList<Produto> para itens do tipo Produto.
//3) Crie uma função na classe CarrinhoDeCompras() para adicionar
//produtos na lista.

class CarrinhoDeCompras() {
    var lista: ArrayList<Produto> = arrayListOf()
    val adicionar: (Produto) -> Unit = { lista.add(it) }
}

//4) Crie uma classe chamada Caixa().
//5) Na classe Caixa() crie uma função chamada fechamentoDeConta(), o
//fechamento receberá 4 funções como parâmetro.

class Caixa(var carrinho: CarrinhoDeCompras) {
    inline fun fecharConta(
        cabecalhoDoComprovante: () -> Unit,
        dataDaCompra: () -> Unit,
        imprimirListaDeCompra: (CarrinhoDeCompras) -> Unit,
        adicionarRodape: (CarrinhoDeCompras) -> Unit
    ) {
        cabecalhoDoComprovante()
        dataDaCompra()
        imprimirListaDeCompra(carrinho)
        adicionarRodape(carrinho)
    }
}