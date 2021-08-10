package `5-Revisao exercicio 1`

class Aluno(
    val ra: Int,
    val nome: String,
    val sobrenome: String
) {

    fun assistirAula(aula: Aula) {
        println("$nome está assistindo a aula de ${aula.materia.nome}")
    }

    fun fazerLicao(aula: Aula) {
        println("$nome está fazendo a lição")
    }

}