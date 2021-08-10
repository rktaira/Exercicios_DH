package `2-ExercicioClientesContas`

/*
Exercício 1: Clientes e Contas
1. Definir uma nova classe Cliente contendo as seguintes propriedades:
- nome
- sobrenome
2. Definir uma nova classe Conta contendo as seguintes propriedades:
- número da conta
- saldo
- titular (o titular é um objeto do tipo Cliente).

3. Criar uma função chamada depósito() que tenha como parâmetro de entrada quantia em
dinheiro. Como estamos fazendo um depósito, a quantia de dinheiro é somada ao saldo.
A função deve imprimir na tela o tipo de transação realizada e o novo saldo.

4. Criar uma função chamada saque() que tenha como parâmetro de entrada quantia em
dinheiro. Como estamos fazendo um saque, a quantia é subtraída do saldo. Caso o valor do
saque a realizar seja maior que o saldo disponível, imprimir na tela: “Saldo insuficiente”.
Caso contrário, a função deve imprimir na tela “Transação realizada!” e o novo saldo,
concatenados.

5. Definir um novo arquivo chamado ExercicioConta e criar uma função main(). Dentro da
função main, criar dois Clientes, passando nome e sobrenome, e criar uma Conta para cada
um, inicializando com o número da conta, saldo e titular. Em seguida, fazer um deposito()
e um saque() em cada conta.

 */

fun main() {

    var cliente1 = Cliente ("José", "Silva")
    var conta1 = Conta (123, 1000, cliente1)

    var cliente2 = Cliente ("Maria", "Silva")
    var conta2 = Conta (321, 1000, cliente2)

    println(conta1.depositar(1000))
    println(conta1.sacar(500))

    println()

    println(conta2.depositar(2000))
    println(conta2.sacar(700))
}