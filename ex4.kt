//Digite o nome do aluno 3 notas e verificar e o aluno foi aprovado ou reprovado, media
//7 para aprovação e imprima na tela.

fun main() {
    print("Digite o nome do aluno: ")
    var nome = readln()!!.toString()
    print("Digite a primeira nota: ")
    var n1 = readln()!!.toFloat()
    print("Digite a segunda nota: ")
    var n2 = readln()!!.toFloat()
    print("Digite a terceira nota: ")
    var n3 = readln()!!.toFloat()

    var media = (n1+n2+n3)/3

    if ((media >= 7) and (media <= 10)) {
        print("\nAluno: ${nome} \nNota: ${media} - Aprovado")
    }else if ((media < 7) and (media >=0)) {
        print("Aluno: ${nome} \nNota: ${media} - Reprovado")

    }else {
        print("ERRO")
    }


}