// ESCREVER UM ALGORITIMO QUE SOME TODOS OS VALORES IMPARES E VALORES
//PARES USANDO ESTRUTURA REPITA

fun main() {
    print("Digite um número: ")
    var n = readln()!!.toInt()

    var pares = 0
    var impares = 0

    do {
        if (n%2 == 0){
            pares += n
        }else {
            impares += n
        }
        n -= 1
    }while (n > 0)

    println("Soma dos pares: $pares \nSoma dos impares: $impares")
}

