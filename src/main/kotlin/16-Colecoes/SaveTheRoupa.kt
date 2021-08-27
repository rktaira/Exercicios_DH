package `16-Colecoes`

fun main() {
/*  SaveTheRoupa S.A.
    A SaveTheRoupa S.A. é uma empresa que deseja implementar um sistema informatizado de
    guarda-volumes de nível mundial. O sistema permite que uma pessoa guarde seus pertences no
    guarda-volumes e depois os retire de maneira simples, bastando apresentar o número de
    identificação recebido.
    Os pertences são representados no sistema por algo abstrato chamado Peça, que tem marca e
    modelo. Assim, se a pessoa perder o número, também poderia retirá-los com essas informações.
    No entanto, o método de retirada será projetado em outro momento.
    1. Criar a classe Peça, que contenha as variáveis marca e modelo, ambas de tipo String
    e um método abstrato chamado retirada.
    2. Criar a classe GuardaVolumes, que tenha como atributo um dicionário e um contador
    que será utilizado como identificador. As chaves do dicionário serão Integer e, como
    valor, haverá uma lista de peças.
    3. Criar a função guardarPecas(MutableList<Peca>) na classe GuardaVolumes, que
    recebe uma lista de peças adiciona essa lista de peças em nosso dicionário e retorna o
    número de identificação, ou seja, a chave do dicionário onde guardamos as peças, que
    neste caso é o nosso contador.
    4. Criar o método mostrarPecas() na Classe GuardaVolumes, que imprime na tela todas
    as peças que estão no guarda-volumes, junto com o número correspondente.
    5. Criar o método mostrarPecas(numero: Int) na Classe GuardaVolumes, que imprima
    as peças que estão associadas ao número recebido
    6. Criar o método devolverPecas(numero: Int) na Classe GuardaVolumes, que remova a
    lista de peças que esta associada ao número recebido.
    7. Na função Main, criar um cenário em que alguém guarda duas peças, recebe o
    código e depois retira suas peças.    */

    var camiseta=Peca("Nike","Camiseta")
    var tenis=Peca("Adidas", "Tenis")
    var cliente1 = mutableListOf(camiseta, tenis)

    var camiseta2=Peca ("Hering", "Camisa")
    var tenis2=Peca("All-star", "Tenis")
    var cliente2 = mutableListOf(camiseta2, tenis2)

    var dicionario: MutableMap<Int, List<Peca>> = mutableMapOf()

    var guarda=GuardaVolumes(dicionario, 1)

    guarda.guardarPecas(cliente1)
    guarda.guardarPecas(cliente2)
    guarda.mostrarPecas()
    guarda.devolverPecas(1)
    guarda.mostrarPecas()
    guarda.mostrarPecas(2)
}