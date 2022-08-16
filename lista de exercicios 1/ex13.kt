//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual
//de reajuste. Calcular e escrever o valor do novo salário.

fun main() {
    print("Digite o salário atual: R$")
    var sal = readln()!!.toFloat()
    print("Digite o percentual de reajuste: ")
    var reaj = readln()!!.toFloat()

    var novo = sal + ((reaj/100)*sal)

    print(("\nNovo salário: R$${novo}"))
}