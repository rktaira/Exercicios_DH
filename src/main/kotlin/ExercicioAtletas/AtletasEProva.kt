package ExercicioAtletas

/*
Exercício 3: Atletas e prova
1. Definir uma nova classe Atleta contendo as seguintes propriedades:
- nome
- nível
- energia

2. Definir uma nova classe Prova contendo as seguintes propriedades:
- dificuldade
- energiaNecessaria

3. Criar, na classe Prova, a função podeRealizar(), que tenha como parâmetro de
 entrada um objeto do tipo Atleta. A função deve retornar true caso o atleta possa
  realizar a prova e, caso contrário, false. Um atleta pode realizar a prova se tiver
  um nível maior ou igual à dificuldade da prova, além de energia suficiente.

4. Definir um novo arquivo chamado AtletasEProva e criar uma função main().
 Dentro da função main, criar dois atletas, configurando as propriedades necessárias,
 e criar três provas para cada um, também com os atributos necessários. Depois, verificar
 se os atletas podem realizar essas provas.
 */

fun main() {
    var atleta1= Atleta("Lucas", 20, 40)
    var atleta2= Atleta("Rafael", 25, 38)

    var corrida = Prova(23, 30)

    println(corrida.podeRealizar(atleta1))
    println(corrida.podeRealizar(atleta2))
}