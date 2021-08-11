package `8-ExercicioSantander`

class ContaCorrente(override val cliente: Cliente,
                    var limite: Float) : Conta(cliente) {

    fun depositarCheques(cheque: Cheque) {
        saldo += cheque.valor
    }

    override fun sacarDinheiro(qtd: Float) {
        if (qtd > saldo + limite) {
            println("Saldo Insuficiente")
        } else if (qtd > saldo) {
            var utilizado = qtd - saldo
            limite -= qtd - saldo
            saldo = 0.00f
            println("Utilizados R$$utilizado do cheque especial")
        } else {
            saldo -= qtd
        }
    }
}