package `6- Revisão exercicio 2`

/*
Exercício 2
Crie uma classe chamada Fatura que possa ser utilizado por uma loja de
suprimentos de informática para representar uma fatura de itens vendidos na loja.
Uma fatura deve incluir as seguintes informações como atributos:
● Uma lista de itens cada Item possui:
• o número do item faturado;
• a descrição do item;
• a quantidade comprada do item
• o preço unitário do item.
Sua classe Item deve conter um construtor que inicialize os quatro atributos. Se a
quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não
for positivo ele deve ser configurado como 0.0.
Além disso, na classe Fatura uma função chamada totalDaFatura que calcula o valor da
fatura (isso é, multiplicar a quantidade pelo preço de cada item) e depois retorna o valor
como um Double.
Escreva um arquivo com uma função Main de teste que demonstra os comportamentos da classe
Fatura
 */

fun main() {
    var mouse = Item(123, "mouse de pc", 2, 50.00f)
    var memoria = Item(234, "memoria ram", -5, 800.00f)

    var listaItens: ArrayList<Item> = arrayListOf(mouse, memoria)

    var fatura1 = Fatura(listaItens)

    println("O total da fatura é R$${fatura1.totalDaFatura()}")

}