package `12-EqualExercicio`

class Coca(var tamanho: Int, var preco: Double) {
    override fun equals(other: Any?): Boolean {
        return(other is Coca && other.tamanho == this.tamanho)
    }

    override fun toString():String {
        return ("$tamanho, R$$preco")
    }

    override fun hashCode(): Int {
        return (tamanho)
    }
}