fun main() {
//  3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

    println(" Informe o primeiro valor:")
    var valor1 = readln().toInt()
    println(" Informe o segundo valor:")
    var valor2 = readln().toInt()
    println(" Informe o terceiro valor:")
    var valor3 = readln().toInt()

    if (valor1 > valor2 && valor1 > valor3) {
        println("O primeiro é maior")
    }
    if (valor2 > valor1 && valor2 > valor3) {
        println(" O segundo valor é maior")
    } else {
        println(" O valor $valor3 é o maior")
    }
}
