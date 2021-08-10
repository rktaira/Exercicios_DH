package `6- Revisão exercicio 2`

fun main() {
    var mouse = Item(123, "mouse de pc", 2, 50.00f)
    var memoria = Item(234, "memoria ram", -5, 800.00f)

    var listaItens: ArrayList<Item> = arrayListOf(mouse, memoria)

    var fatura1 = Fatura(listaItens)

    println("O total da fatura é R$${fatura1.totalDaFatura()}")

}