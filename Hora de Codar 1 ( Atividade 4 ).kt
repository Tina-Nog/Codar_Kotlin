fun main() {
    // 4. Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas.
   // O usuário irá informar os valores de cada variável.

        // Área do Retângulo
    println("Digite a base do Retângulo:")
    val base = readln().toFloat()
    println("Digite a altura do Retãngulo:")
    val altura= readln().toFloat()
    println("A área do Retângulo é: ${base*altura}")

    // Área do Quadrado
    println("Digite o lado do Quadrado: ")
    val lado= readln().toFloat()
    println(" A área do Quadrado é:${lado*lado}")

    // Área do Losango
    println("Digite a diagonal maior do Losango:")
    val diagonalmaior= readln().toFloat()
    println("Digite a diagonal menor do Losango:")
    val diagonalmenor= readln().toFloat()
    println(" A área do Losango é:${diagonalmaior*diagonalmenor/2}")

    // Área do Trapézio
    println("Digite a base maior do Trapézio:")
    val basemaior= readln().toFloat()
    println("Digite a base menor do Trapézio:")
    val basemenor= readln().toFloat()
    println(" A área do Trapézio é:${basemaior*basemenor/2}")

    // Área do Paralelograma
    println("Quanto é a base do Paralelograma:")
    val base1= readln().toFloat()
    println("Quanto é altura do Paralelograma:")
    val altura1= readln().toFloat()
    println("A área do Paralelograma é:${base1*altura1}")

    // Área do Triângulo
    println("Valor da base do Triângulo:")
    val base2= readln().toFloat()
    println(" Valor da altura do Triângulo:")
    val altura2= readln().toFloat()
    println(" A área do Triângulo é : ${base2*altura2/2}")

    // Área do Circulo
    println("Valor do raio do Circulo: ")
    val raio= readln().toFloat()
    val pi: Double = 3.14
    println(" A área do raio é:${raio*raio*pi}")




}

