
fun main() {
    //6. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)
var maior=

    println("Qual é o  primeiro número:")
    var nume1= readln().toInt()
    println("Qual é o segundo número:")
    var nume2= readln().toInt()
    println("Qual é o terceiro número:")
    var nume3= readln().toInt()
    println("Qual é o quarto número:")
    var nume4= readln().toInt()

    if (nume1 > maior){
       var maior= nume1}
    if (nume2 > maior){
       var  maior= nume2}
    if (nume3 > maior){
       var maior= nume3}
    if (nume4 > maior){
      var   maior= nume4}
    println(" O primeiro valor é:$nume1")
    println(" O último valor é:$nume4")
println("O maior valor é:$maior")
}