// ESCREVER UM ALGORITMO QUE O USUARIO ESCOLHA O NUMERO QUE FORME A
//TABUADA

fun main() {
    print("Digite um número: ")
    var n = readln()!!.toInt()

    var cont = 1
    while (cont < 11){
        println("$n x $cont = ${n*cont}")

        cont ++
    }

}