fun main() {
    println(ex1(3, 5, 7))
    println(ex2("testando texto igual","testando texto igual"))
    println(ex3(3))
    println(ex4())
    println(ex5(7, 2, 6, 5))
    println(ex6())

}


//1) Escrever o código que deve analisar três números inteiros e retornar o maior deles.

fun ex1(numeroUm: Int, numeroDois: Int, numeroTres: Int): Int {
    return maxOf(numeroUm, numeroDois, numeroTres)
}

/*2) Escrever o código que deve analisar duas cadeias de texto e,
 caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
 */

fun ex2(textoUm: String, textoDois: String): Boolean {
    if (textoUm==textoDois) {return true}
    else {return false}
}

/*3) Escrever o código que deve analisar um número inteiro e,
 caso ele seja par, retornar true, caso contrário, retorna false.
 */

fun ex3(valorUm: Int): Boolean {
    if (valorUm%2==0) {return true}
    else {return false}
    }

/*4) Escrever um programa que imprima na tela os primeiros 100 números
inteiros positivos ímpares.
 */

fun ex4() {
    for (i in 1..200) {
        if(i%2==1) {print("$i, ")}
    }
}

/*5) Escrever um código que deve analisar quatro números inteiros e,
 caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD,
  retornar true, caso contrário, retornar false.
 */

fun ex5(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    if((numA>numC && numA>numD) || (numB>numC && numB>numD)) {return true}
    else {return false}
}

//6) Escrever um programa que exiba os primeiros 100 números positivos.

fun ex6() {
    for (i in 1..200) {
        if(i%2==0) {print("$i, ")}
    }
}