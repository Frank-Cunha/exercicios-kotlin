import java.util.*

fun main() {
    var read = Scanner(System.`in`)

    println("Nota A: ")
    var notaa = read.nextFloat()
    println("Nota B: ")
    var notab = read.nextFloat()

    var media = (notaa+notab)/2

    print("Média do aluno: ${media}")
}