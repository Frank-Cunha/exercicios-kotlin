import java.util.*

fun main() {
    var read = Scanner(System.`in`)

    print("Digite um número: ")
    var n = read.nextInt()
    print("Digite outro número: ")
    var n2 = readln()!!.toInt()

    print("Soma dos valores: ${n +n2} \nSubtração dos valores: ${n -n2} \nMultiplicação dos valores: ${n*n2} \n" +
            "Divisão dos valores: ${(n / n2)}")
}