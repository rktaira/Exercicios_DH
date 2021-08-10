package `5-Revisao exercicio 1`

class Professor(val nome: String, val rd: Int) {

    fun darAulas(aula:Aula) {
        println("$nome está dando aula de ${aula.materia.nome}")
    }

    fun fazerChamada() {}
}