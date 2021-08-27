package `16-Colecoes`

import `15-InlineFunction`.Produto

//1. Criar a classe Peça, que contenha as variáveis marca e modelo, ambas de tipo String
//e um método abstrato chamado retirada.
class Peca(val marca: String, val modelo: String) {

}

//2. Criar a classe GuardaVolumes, que tenha como atributo um dicionário e um contador
//que será utilizado como identificador. As chaves do dicionário serão Integer e, como
//valor, haverá uma lista de peças.

class GuardaVolumes(val dicionario: MutableMap<Int, List<Peca>>, var contador: Int = 1) {

//    3. Criar a função guardarPecas(MutableList<Peca>) na classe GuardaVolumes, que
//    recebe uma lista de peças adiciona essa lista de peças em nosso dicionário e retorna o
//    número de identificação, ou seja, a chave do dicionário onde guardamos as peças, que
//    neste caso é o nosso contador.
    fun guardarPecas(lista: MutableList<Peca>): Int {
        dicionario.put(contador, lista)
        println("""=========================
            |Número de identificação: $contador 
            |Itens depositados: ${lista.map {it.modelo + " " + it.marca}}
            |=========================""".trimMargin())
        contador++
        return contador - 1
            }

//    4. Criar o método mostrarPecas() na Classe GuardaVolumes, que imprime na tela todas
//    as peças que estão no guarda-volumes, junto com o número correspondente.

    fun mostrarPecas() {
        println("Lista de todos os itens no depósito:")
        dicionario.forEach {
            println("Número ${it.key}: ${it.value.map {it.modelo + " " + it.marca}}")

        }
        println()
    }

//    5. Criar o método mostrarPecas(numero: Int) na Classe GuardaVolumes, que imprima
//    as peças que estão associadas ao número recebido

    fun mostrarPecas(chave: Int):Unit {
        println("Lista de todos os itens associados ao numero $chave:")
        println(dicionario[chave]?.map { it.modelo + " " + it.marca })
        println()
    }


    fun devolverPecas(numero: Int) {
        dicionario[numero] = listOf()
    }
}

