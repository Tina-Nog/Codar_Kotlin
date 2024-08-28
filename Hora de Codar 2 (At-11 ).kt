fun main(){
    //11. Uma micro calculadora
//Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
//O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.
    var  valor=

            println(" Qual a operação desejada:")
    var op = readln().toInt()
    println(" Ditite:")
    println(" Digite 1 para Somar")
    println(" Digite 2 para Subtração")
    println(" Ditite 3 para Divição")
    println(" Digite 4 para Mutiplicação")
    println(" Qual o Primeiro valor:")
    var n1= readln().toDouble()
    println(" Qual o Segundo valor:")
    var n2= readln().toDouble()

    if(op==1) {
        valor = n1 + n2
        println(" A soma é:$soma")

        else if (op == 2) {
            valor = n1 - n2
            println(" A subtração é:$sub")
        } else if (op == 3) {
            valor = n1 / n2
            println(" A divição é:$div")
        } else if (op == 4) {
            valor = n1 * n2
            println(" A multiplicação é:$mult")
        } else {
            println("Operação invalida!")
        }
    }}
