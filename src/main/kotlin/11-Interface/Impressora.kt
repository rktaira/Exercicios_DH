package `11-Interface`

//Em seguida crie uma classe chamada Impressora, nesta classe terá
//uma propriedade chamada listaimprimivel, essa propriedade é do tipo
//mutableListOf, que vai carregar uma lista do tipo Imprimivel.
//Documento mutableListOf:
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/mutabl
//e-list-of.html
//Crie uma função que pega um Imprimível e adiciona na listaimprimivel,
//para isso a função recebe como parâmetro uma propriedade do tipo
//Imprimivel, assim conseguirá adicionar esse imprimível na lista, através
//do .add().
//Crie uma função que imprima tudo que está na listaimprimivel, nessa
//função pode-se utilizar do for para percorrer a lista e imprimir todos os
//aquivos. Segue o exemplo:
//for (tipoDaLista in nomeDaLista){
////execute o bloco
//}


class Impressora() {
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionar(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun imprimir() {
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
    }
}