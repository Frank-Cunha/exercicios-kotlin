//1 Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e
//escrever a área do retângulo.

fun main() {
    print("Digite a base do retângulo: ")
    var b = readln()!!.toInt()
    print("Digite a altura do retângulo: ")
    var a = readln()!!.toInt()

    var area = a*b

    print("\nÁrea do retângulo: ${area}m²")
}