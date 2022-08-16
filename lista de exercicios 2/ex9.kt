// Escrever um algoritmo que gere e escreva os números ímpares entre 100 e 200.

fun main() {

    for (i in 100..200){

        if (i%2 != 0){
            print("$i, ")
        }

    }
}