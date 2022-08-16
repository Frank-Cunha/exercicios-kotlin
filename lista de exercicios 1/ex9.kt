
fun main() {

    print("Digite a primeira nota: ")
    var nota1 = readln()!!.toFloat()
    print("Digite a segunda nota: ")
    var nota2 = readln()!!.toFloat()
    print("Digite a terceira nota: ")
    var nota3 = readln()!!.toFloat()

    var media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2+3+5)

    print("\nMedia final: ${media}")



}