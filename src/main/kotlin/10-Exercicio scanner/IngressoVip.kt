package `10-Exercicio scanner`

class IngressoVip(valor: Float):Ingresso(valor){
    override fun imprimeValor() {
        println("Ingresso VIP: R$$valor")
    }
}