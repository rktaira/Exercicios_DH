package `15-InlineFunction`

import java.util.*
import java.util.Calendar.*

fun openDB(processoDeAbertura: () -> Unit, data: () -> String) {
    println("Iniciando abertura")
    println("Data de abertura: ${data()}")
    processoDeAbertura()
}

fun processoDeAbertura() {
    println("Iniciando a execução")
    println("Abertura concluída")
}

val dataFormata: () -> String = {
    val data = Calendar.getInstance()
    "${data.get(DATE)}/${data.get(MONTH)}/${data.get(YEAR)}"
}

fun main() {
    openDB(processoDeAbertura = {processoDeAbertura()}, data= {dataFormata()})
}