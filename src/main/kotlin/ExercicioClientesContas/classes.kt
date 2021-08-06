package ExercicioClientesContas

class Cliente(var nome: String, var sobrenome: String)

class Conta(var numero: Int, var saldo: Int = 0, var titular: Cliente) {
    fun depositar(quantia: Int): String {
        saldo = saldo + quantia
        return "Depósito realizado. Saldo= $saldo"
    }

    fun sacar(quantia: Int): String {
        if (quantia> saldo) {
            return ("Saldo Insuficiente")
        } else {
            saldo= saldo - quantia
            return ("Saque realizado. Saldo= $saldo")
        }
    }
}