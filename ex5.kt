
fun main() {

    print("Primeiro lado: ")
    var lado1 = readln()!!.toInt()
    print("Segundo lado: ")
    var lado2 = readln()!!.toInt()
    print("Terceiro lado: ")
    var lado3 = readln()!!.toInt()

    if ((lado1 < lado2+lado3) and (lado2 < lado3+lado1) and (lado3 < lado1+lado2)){
        println("As medidas formam um triângulo!")
        if ((lado1 == lado2) and  (lado1 == lado3)) {
            println("Triângulo equilátero")
        } else if ((lado1 != lado2) and (lado1 != lado3) and (lado2 != lado3)) {
            println("Triângulo escaleno")
        } else {
            println("Triângulo isosceles")
        }

    } else {
        println("As medidas não formam um triângulo")
    }


}