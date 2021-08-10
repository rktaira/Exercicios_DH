package `3-ExJogadoresTreinamento`

class JogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {
    fun fazerGol() {
        energia = energia -5
        alegria = alegria +5
        gols = gols +1
        println("GOOOOL!")
    }

    fun correr() {
        if(energia>=10) {
            energia = energia-10
            println("$nome: Cansei")
        }

    }

}

class SessaoDeTreinamento (var experiencia: Int) {
    fun treinarA (jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiência Inicial: "+jogador.experiencia)
        jogador.experiencia=jogador.experiencia+ experiencia
        println("Experiência Final: "+jogador.experiencia)
    }
}