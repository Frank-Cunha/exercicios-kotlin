//Escreva um algoritmo que leia um valor inicial A e imprima a sequência de valores
//do cálculo de A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120

fun main() {
    print("Digite um valor: ")
    var n = readln()!!.toInt()

    var fat = 1
    print("${n}! = ")
    for (i in n downTo 2){
        print("$i x ")
        fat *= i
    }
    print("1 = $fat")


}