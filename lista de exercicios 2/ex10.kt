//Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá
//calcular e mostrar: a. A menor altura do grupo; b. A maior altura do grupo;

fun main() {
    var maior = 0f
    var menor = 0f

    for (i in 1..15) {
        print("Digite a altura da ${i}a. pessoa: ")
        var altura = readln()!!.toFloat()

        if (i == 1){
            maior = altura
            menor = altura
        }

        if (altura > maior){
            maior = altura
        }

        if (altura < menor){
            menor = altura
        }


    }

    print(("\nMaior altura: $maior \nMenor altura: $menor"))
}