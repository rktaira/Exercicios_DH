package `7-RevisaoExercicio3`

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    init {
        if (qtdMinima < 0) {
            qtdMinima = 0
        }
        if (qtdAtual < 0) {
            qtdAtual = 0
        }
    }

    fun mudarNome(nome: String): Unit {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int): Unit {
        if (qtdMinima >= 0) {
            this.qtdMinima = qtdMinima
        } else {
            println("Quantidade mínima não pode ser negativa")
        }
    }

    fun repor(qtd: Int): Unit {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int): Unit {
        if (qtd <= qtdAtual) {
            qtdAtual -= qtd
        } else {
            println("Quantidade atual insuficiente")
        }
    }

    fun mostra(): String {
        return """
            Item: $nome
            Quantidade mínima: $qtdMinima
            Quantidade atual: $qtdAtual
            
        """.trimIndent()
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }

}