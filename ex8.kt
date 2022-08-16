import java.text.DecimalFormat

fun main() {
    val df = DecimalFormat("#.##") //Os "#.##" determinam quantos números depois do ponto serão mostrados

    print("Digite a temperatura em Fahrenheit: ")
    var f = readln()!!.toFloat()

    var celsius = 5*(f-32)/9

    print("Temperatura em graus Celsius: " + df.format(celsius)) //Função df.format() usada para formatar


}