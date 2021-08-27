package `15-InlineFunction`
//Exercício
//Vamos modelar um sistema de caixa de um supermercado:

//11) Por fim, crie uma função Main() e faça execute seu código ;-)
//Na função Main, utilize o recurso de parametro nomeado ao chamar
//as funções, para qualquer programador entender quais parametros
//estão sendo passados para as funções.
//A impressão deverá ser a seguinte:
//##########DH SuperMarket##########
//Data: dia/mes/ano
//nomeDoItem R$ 00,00
//nomeDoItem R$ 00,00
//nomeDoItem R$ 00,00
//nomeDoItem R$ 00,00
//nomeDoItem R$ 00,00
//nomeDoItem R$ 00,00
//Total: R$ 00,00

fun main() {
    val arroz = Produto("Arroz 1kg", 5.99)
    val feijao = Produto("Feijão 1kg", 8.49)
    val leite = Produto("Leite 1l", 5.49)
    val suco = Produto("Suco 1l", 4.99)

    val carrinho = CarrinhoDeCompras()
    carrinho.adicionar(arroz)
    carrinho.adicionar(arroz)
    carrinho.adicionar(feijao)
    carrinho.adicionar(feijao)
    carrinho.adicionar(leite)
    carrinho.adicionar(suco)

    val caixa = Caixa(carrinho)
    caixa.fecharConta(cabecalhoDoComprovante, dataDaCompra, imprimirListaDeCompra, adicionarRodape)
}