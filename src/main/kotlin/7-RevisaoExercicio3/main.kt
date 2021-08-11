package `7-RevisaoExercicio3`

fun main() {

    var caneta = Estoque("Caneta", 50, 15)

    println(caneta.mostra())

    caneta.mudarNome("Caneta BIC")
    caneta.mudarQtdMinima(10)
    caneta.repor(20)

    println(caneta.mostra())

    caneta.darBaixa(60)

    println(caneta.mostra())

    println(caneta.precisaRepor())


}