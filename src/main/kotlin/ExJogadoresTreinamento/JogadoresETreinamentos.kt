package ExJogadoresTreinamento

/*
Exercício 2: Jogadores e treinamento
1. Definir uma nova classe JogadorDeFutebol contendo as seguintes propriedades:
- nome
- energia
- alegria
- gols
- experiência

2. Criar uma função chamada fazerGol() em JogadorDeFutebol, que tire 5 pontos de energia e
dê 10 pontos de alegria ao jogador, além de aumentar o número de gols em 1. A função deve
imprimir “GOOOOL!” na tela.

3. Criar uma função chamada correr() em JogadorDeFutebol, que tire 10 pontos de energia dele.
O método deve imprimir na tela: “Cansei”.

4. Definir uma nova classe SessaoDeTreinamento contendo as seguintes propriedades:
- experiência (ganha quando um treinamento é realizado)

5. Criar uma função chamado treinarA que tenha como parâmetro de entrada um jogador de
futebol. Como é um treinamento, o jogador precisa:
1- Correr 2- Fazer um Gol 3- Correr
Depois que o JogadorDeFutebol fizer essas três coisas, a experiência dele deve aumentar,
somando um ponto na experiência. A função deve imprimir a experiência inicial e a
experiência final do jogador.

6. Definir um novo arquivo chamado JogadoresETreinamentos e criar uma função main().
Dentro da função main, criar dois JogadorDeFutebol configurando as propriedades necessárias,
e criar uma SessaoDeTreinamento, também com as propriedades necessárias. Os dois jogadores
devem realizar um treinamento.
 */

fun main() {
    var jogador1 = JogadorDeFutebol("João", 100,100,20,50)
    var jogador2 = JogadorDeFutebol("José", 80, 90, 15, 44)

    var treinamento1= SessaoDeTreinamento(10)

    treinamento1.treinarA(jogador1)

    println()

    treinamento1.treinarA(jogador2)

}