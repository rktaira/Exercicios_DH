package `8-ExercicioSantander`

class ContaPoupanca(
    override val cliente: Cliente,
    var juros: Float
) : Conta(cliente) {

    fun recolherJuros() {}
}