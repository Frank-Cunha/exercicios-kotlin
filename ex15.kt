//Uma revendedora de carros usados paga a seus funcionários vendedores um salário
//fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do
//valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros
//por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe
//por carro vendido. Calcule e escreva o salário final do vendedor

fun main() {
    print("Digite o número de carros vendidos: ")
    var car_vendas = readln()!!.toInt()
    print("Valor total de suas vendas: R$")
    var valor_tot = readln()!!.toFloat()
    print("Salário fixo: R$")
    var sal_fixo = readln()!!.toFloat()
    print("Valor recebido por carro vendido: R$")
    var val_por_carro = readln()!!.toFloat()

    var sal = sal_fixo + (val_por_carro * car_vendas) + (valor_tot*(5/100))

    print("Seu salário será: R$${sal}")
}