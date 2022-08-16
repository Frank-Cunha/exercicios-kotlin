//faça um algoritmo para verificar a idade do cidadão

fun main() {

    print("Digite o ano atual: ")
    var ano = readln()!!.toInt()
    print("Digite seu ano de nascimento: ")
    var ano_nas = readln()!!.toInt()

    var idade = ano - ano_nas

    print("Você tem ${idade} anos")

}