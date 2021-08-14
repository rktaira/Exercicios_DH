package `10-Exercicio scanner`

class IngressoPadrao(valor:Float):Ingresso(valor) {
    override fun imprimeValor(){
        println("Ingresso Padrão R$$valor")
    }
}