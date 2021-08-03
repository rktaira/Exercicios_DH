package classes

/*1) Escreva uma classe que receba como parâmetro uma idade, um sexo e os anos de contribuição
para a aposentadoria e desenvolva uma função que imprime no console verdadeiro ou falso.
Lembrando que:
- A idade mínima para mulheres é de 60 anos;
- A idade mínima para homens é de 65 anos;
- Em ambos os casos as pessoas devem ter pelo menos 30 anos de contribuição.
 */

class Pessoa (var idade: Int, var sexo: String, var anos: Int) {

    fun aposentadoria(){
        if(sexo=="Homem"&&idade>=65&&anos>=30) {println ("true")}
        else if (sexo=="Mulher" && idade>=60 && anos>=30) {println ("true")}
        else {println ("false")}
    }
}

/*2) Escreva uma classe que receba uma lista de números e uma
função que imprime no console o produto ou seja o resultado de
multiplicar todos os elementos entre si.

Por exemplo: array[1, 4, 7] deve imprimir 28, que é 1 * 4 * 7.
*/

class Lista (var numeroUm: Int, var numeroDois: Int, var numeroTres: Int) {

    fun multiplicar(): Int {
        return numeroUm * numeroDois * numeroTres

    }
}