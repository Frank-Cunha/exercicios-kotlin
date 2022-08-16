// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que
//diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a
//pessoa nasceu).

fun main() {
    print("Digite o ano atual: ")
    var ano = readln()!!.toInt()
    print("Digite seu ano de nascimento: ")
    var ano_nas = readln()!!.toInt()

    var idade = ano - ano_nas

    if (idade >= 16){
        print("\nVocê pode votar!\nIdade: ${idade} anos")
    } else
        print("\nVocê não pode votar :'(\nidade: ${idade} anos")

}