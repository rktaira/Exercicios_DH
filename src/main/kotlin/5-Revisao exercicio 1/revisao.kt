package `5-Revisao exercicio 1`

/*
Exercício 1
A Digital House decidiu desenvolver um sistema de cadastro de alunos com seus respectivos cursos,
professores responsáveis e turmas, para esse sistema foram levantados os seguintes requisitos:
• A matéria dada em cada aula possui um nome;
• A aula possui uma matéria, um horário de início e término;
• O aluno possui um RA (Registro Acadêmico), nome, sobrenome.
• O aluno pode assistir as aulas e fazer as lições de casa;
• O curso possui um nome, uma lista de aulas, uma lista de alunos e um professor responsável;
• O professor possui um nome e um RD (Registro Docente);
• O professor por ser um Docente tem a obrigatoriedade de dar aulas e fazer a chamada dos alunos;
• A turma deverá conter um nome e um curso associado
 */

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