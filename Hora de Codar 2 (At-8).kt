fun main(){

    //8. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores
    // que 0 e menores que 10.No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste".
    //  Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"


    var  soma=0
    var  media=0
    var  valor =0
            println("Digite o primeiro número :")
    var numero1 = readln().toInt()
    println(" O segundo número")
    var numero2 = readln().toInt()
    println(" Terceiro número")
    var numero3 = readln().toInt()
    println(" Quarto número")
    var numero4 = readln().toInt()
    if  (numero1>0 || numero1<10){
        soma + numero1
        valor+1}
    if (numero2>0 || numero2 <10){
        soma+ numero2
        valor+1 }
    if (numero3>0 || numero3<10){
        soma+numero3
        valor + 1}
    if  (numero4>0 || numero4<10){
        soma+numero4
        valor + 1}

     media= soma.div(valor)
            if (media>=5){
                println("Você passou no teste")
            }
    else {
        println(" Tente novamente o processo ")
    }
}