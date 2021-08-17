package `11-Interface`

//Por fim crie um arquivo kotlin que contenha a função Main, dentro dela
//crie um objeto de cada classe, sendo Documento, Foto, Contrato e
//Impressora. Agora utilizando a impressora adicione cada documento na
//impressão e imprima todos.

fun main() {

    val selfie = Foto("selfie", "foto")
    val rg = Documento("RG", "documento")
    val contratoDeTrabalho = Contrato("Contrato de Trabalho", "contrato")

    val impressora = Impressora()

    impressora.adicionar(selfie)
    impressora.adicionar(rg)
    impressora.adicionar(contratoDeTrabalho)

    impressora.imprimir()
}