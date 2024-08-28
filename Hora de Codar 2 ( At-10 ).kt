fun main() {
    //10. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa.
    // Construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
    var peso =0
        println("Qual é a seu genero?1 feminino,2 masculino:")
    var genero = readln().toInt()
    println("Digite sua altura:")
    var altura = readln().toDouble()
    if (genero == 1) {
        peso = (62.1 * altura) - 44.7
        println(" Seu peso ideal é:")
    }
    if (genero== 2) peso = (72.7 * altura) -58{
        println(" Seu peso ideal é:", $"peso")}
}
