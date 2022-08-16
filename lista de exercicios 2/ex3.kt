//USUARIO DEVER INFORMAR O NUMERO E COMO RESPOSTA SERA SE E PAR OU IMPAR
//E PRIMO USANDO ESTRUTURA REPITA

fun main() {
    print("Digite um número: ")
    var n = readln()!!.toInt()

    if (n%2 == 0){
        println("Par")
    }else {
        println("Impar")
    }

    var divisores = 0
    var cont = n

    do {
        if(n%cont == 0){
            divisores += 1
        }
        cont -=1
    }while (cont > 0)

    if (divisores == 2){
        println("Primo")
    }else{
        println("Não primo")
    }
}