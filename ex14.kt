//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
//positivo).

fun main() {
    print("Digite um valor: ")
    var n = readln()!!.toInt()

    if (n >= 0) {
        print("\nPositivo!")
    }else {
        print("\nNegativo!")
    }
}