package Herança

open class Animal {
    var tamanho: Int =0
    var peso: Double =0.0
    var cor: String =""

    open fun correr(): String {
        return "Animal está correndo"
    }
}