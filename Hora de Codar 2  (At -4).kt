fun main(){
    //4. Faça um programa que leia 3 valores informados pelo usuário
    //(considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.


    println("Digite o primeiro valor:")
    var valor1 = readln().toInt()
    println(" Digite o segundo valor:")
    var valor2 = readln().toInt()
    println(" Digite o terceiro valor:")
    var valor3= readln().toInt()

    if (valor1>valor2 && valor1>valor3){
        var soma = valor1 + valor3
        println(" Os dois maiores valores é: $soma")
    }
    if (valor2>valor1 && valor3>valor1){
       var soma =valor2+valor3
        println(" Os dois maiores valores é:$soma")
    }
    else{
        var soma = valor2 + valor1
        println(" Os dois maiores valores é:$soma")}
}