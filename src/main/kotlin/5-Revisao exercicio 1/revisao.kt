package `5-Revisao exercicio 1`

fun main() {
    var ana = Aluno(123, "Ana", "Cortez")
    var marcelo = Aluno(456, "Marcelo", "Marcelo")
    var ricardo = Aluno(789, "Ricardo", "Taira")

    var listaAlunos = arrayListOf<Aluno>(ana, marcelo, ricardo)

    var romario = Professor("Romario", 321)
    var jonatas = Professor("Jônatas", 654)

    var listaProfessores = arrayListOf<Professor>(romario, jonatas)

    var kotlin = Materia("Kotlin")
    var android = Materia("Android")

    var aula1 = Aula(kotlin, "19:30", "21:45")
    var aula2 = Aula(android, "19:30", "21:45")

    var listaAulas = arrayListOf<Aula>(aula1, aula2)

    var cursoMobile = Curso("Curso Mobile", listaAulas, listaAlunos, listaProfessores)

}