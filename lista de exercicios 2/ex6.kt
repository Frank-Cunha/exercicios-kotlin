// ESCREVER UM ALGORITMO QUE O USUARIO DIGENTE VARIOS NUMEROS E DE COMO
//RESPOSTA MAIOR NUMERO E MENOR NUMERO

fun main() {
    var cont = 0
    var maior = 0
    var menor = 0

    while (cont < 10) {
        print("Digite um número: ")
        var n = readln()!!.toInt()

        if (cont == 0){
            maior = n
            menor = n
        }

        if (n > maior){
            maior = n
        }

        if (n < menor){
            menor = n
        }

        cont ++
    }

    print("\nMaior: $maior \nMenor: $menor")
}