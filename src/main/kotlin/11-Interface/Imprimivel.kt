package `11-Interface`

//Criar uma interface Imprimível que contém dois atributos nome e
//tipo de documento, ambas são do tipo String. Em seguida crie a assinatura da
//função imprimir().


interface Imprimivel {
    var nome: String
    var tipoDeDocumento: String

    fun imprimir()
}