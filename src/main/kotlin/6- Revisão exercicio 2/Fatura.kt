package `6- Revisão exercicio 2`

class Fatura(var listaItens: ArrayList<Item>) {

    fun totalDaFatura(): Double {

        var soma = 0.00

        listaItens.forEach { item ->
            if (item.quantidade > 0 && item.preco > 0) {
                soma += item.preco * item.quantidade
            }
        }
        return soma
    }
}