package `1-ExercicioAtletas`

class Atleta(
    val nome: String,
    val nivel: Int,
    var energia: Int)

class Prova(
    val dificuldade: Int,
    var energiaNecessaria: Int) {
fun podeRealizar(atleta:Atleta): Boolean {
    if (energiaNecessaria>atleta.energia || dificuldade>atleta.nivel) {return false}
    else {return true}
    }
}

