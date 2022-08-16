//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após,
//calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).

fun main() {
    print("Digite o número da conta: ")
    var n_conta = readln()!!.toInt()
    print("Digite o saldo: ")
    var saldo = readln()!!.toFloat()
    print("Digite o débito: ")
    var debito = readln()!!.toFloat()
    print("Digite o crédito: ")
    var credito = readln()!!.toFloat()


    var saldo_atual = saldo - debito + credito

    println("Saldo atual: ${saldo_atual}")

}