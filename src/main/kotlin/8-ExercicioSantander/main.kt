package `8-ExercicioSantander`

fun main() {
    var cheque1 = Cheque(500.00f, 123, "10/10/2020")

    var cliente1 = Cliente(123, "Silva", 1234466, 12332456)

    var corrente1= ContaCorrente(cliente1, 1000.00f)
    var poupanca1= ContaPoupanca(cliente1, 0.0001f)

    //Teste de funções da conta corrente
    corrente1.consultarSaldo()
    corrente1.fazerDeposito(700.00f)
    corrente1.sacarDinheiro(400.00f)
    corrente1.consultarSaldo()
    corrente1.depositarCheques(cheque1)
    corrente1.consultarSaldo()
    corrente1.sacarDinheiro(2000.00f)
    corrente1.sacarDinheiro(1000.00f)
    corrente1.consultarSaldo()
    println(corrente1.limite)

    println()

    poupanca1.consultarSaldo()
    poupanca1.fazerDeposito(700.00f)
    poupanca1.sacarDinheiro(400.00f)
    poupanca1.consultarSaldo()

}
