//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//2. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

    println(" O valor informado é:")
    var valor = readln().toInt()
    if (valor > 0) {
        println("O valor  é positivo")
    } else if (valor < 0) {
        println(" O valor é negativo")
    } else {
        println("O valor zero é neutro")
    }
}

