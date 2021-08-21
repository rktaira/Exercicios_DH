package `12-EqualExercicio`

//Exercício 1:
//1. Criar a classe Pessoa que tenha como propriedades nome (String) e RG
//(Integer).
//2. Na classe Main, criar duas pessoas com o mesmo número de RG.
//3. Usando equals (==), comparar se a primeira pessoa criada é igual à
//segunda. Qual é o resultado?
//4. Sobrescrever o equals da classe Pessoa para que compare apenas o
//número de RG.
//5. Sobrescrever também a função toString e HashCode. Onde, toString fará o
//print do nome + RG e o hashCode utilizará o RG como valor de retorno
//6. Refazer a comparação utilizando o equals (==). Qual é o resultado? O que
//mudou? Por quê?

fun main() {

    var pessoa1 = Pessoa("Joao", 12312)
    var pessoa2 = Pessoa("Maria", 12312)

    println(pessoa1==pessoa2)

    println(pessoa1)
    println(pessoa2.hashCode())

    println(pessoa1 == pessoa2)

    println(
        """
        
        Exercício 2
        """.trimIndent()
    )
//Exercício 2:
//1. Criar a classe Coca que tenha como propriedades um tamanho (Integer) e
//preço (Double).
//2. Na classe Main, criar duas Cocas com o mesmo tamanho.
//3. Usando equals (==), comparar se a primeira Coca criada é igual à segunda.
//Qual é o resultado?
//4. Sobrescrever o equals (==) da classe Coca para que compare apenas o
//tamanho.
//5. Sobrescrever também a função toString e HashCode. Onde, toString fará o
//print do tamanho + preço e o hashCode utilizará o Tamanho como valor de
//retorno
//Exercícios
//6. Refazer a comparação utilizando o equals. Qual é o resultado? O que
//mudou? Por quê?

    var coca1 = Coca(500, 4.50)
    var coca2 = Coca(500, 7.00)

    println(coca1)
    println(coca2)
    println(coca1==coca2)
    //coca1 retorna "500, R$4.5" e coca2 retorna "500, 7,5". Função equals retorna verdadeiro
    //porque está comparando apenas o tamanho.

    println(
        """
        
        Exercício 3
        """.trimIndent()
    )

//    Exercício 3:
//    1 - Crie a data classe Pessoa, que tenha como propriedades um nome e um CPF
//    (Integer)
//    2 - Na classe Main, criar duas Pessoas com os mesmos atributos
//    3 - Faça a impressão do toString e hashCode
//    3 - Usando equals (==), comparar se a primeira Pessoa criada é igual a segunda

    var dataPessoa1=DataPessoa("Zé", 2323)
    var dataPessoa2=DataPessoa("Zé", 2323)

    println("toString da pessoa 1: $dataPessoa1")
    println("toString da pessoa 2: $dataPessoa2")

    println("hashcode da pessoa 1: ${dataPessoa1.hashCode()}")
    println("hashcode da pessoa 2: ${dataPessoa2.hashCode()}")

    println(dataPessoa1==dataPessoa2)


}