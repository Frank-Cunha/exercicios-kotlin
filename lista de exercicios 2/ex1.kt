fun main() {
    print("Digite um número: ")
    var n = readln()!!.toInt()

    var cont = 0

    while (cont <= n){
        print("$cont ")
        cont += 1
    }
}