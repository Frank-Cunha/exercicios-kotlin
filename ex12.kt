import java.util.Calendar;

fun main() {
    val c = Calendar.getInstance()
    var ano = c.get(Calendar.YEAR)
    var mes = c.get(Calendar.MONTH)
    var dia = c.get(Calendar.DAY_OF_MONTH)

    print("Digite o ano de nascimento: ")
    var a = readln()!!.toInt()
    print("Digite o mês:  ")
    var m = readln()!!.toInt()
    print("Digite o dia:  ")
    var d = readln()!!.toInt()
    m -= 1

    var dias_a = (dia+(mes*30))
    var dias = (d+(m*30))

    var idade =  ano - a

    if (dias > dias_a){
        println("Sua idade é ${idade -1} anos")
    } else if(dias <= dias_a){
        println("Sua idade é ${idade} anos")
    }

}