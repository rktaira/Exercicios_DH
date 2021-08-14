package `9-Scanner e Set Value`

//Quando usar o set value, usar "field" pra não fazer um ciclo infinito

class Aluno(){
    var numero = 0
        set(value) {
            field = value
        }
}