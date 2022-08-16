fun main() {
    print("Digite um número: ")
    var n = readln()!!.toInt()

    while (n>0){
        print("$n ")
        n -= 1
    }
}