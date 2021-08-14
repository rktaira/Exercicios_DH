package `8-ExercicioSantander`

open class Conta(open val cliente: Cliente) {

    var saldo: Float = 0.00f

    fun fazerDeposito(qtd: Float) {
        saldo += qtd
    }

    open fun sacarDinheiro(qtd: Float) {
        if (qtd>saldo) {"saldo insuficiente"}
        else{saldo -= qtd}
    }

    fun consultarSaldo() {
        println("Seu saldo é de R$$saldo")
    }

}