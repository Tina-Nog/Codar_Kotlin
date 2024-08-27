fun main(){
    //7. Faça um programa que leia 6 números que o usuário vai informar.Todos os números lidos com valor inferior a 72 devem ser somados.
    //Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
    var soma=0

    println("Digite o número:")
    var vl1= readln().toInt()
    println("Digite o número:")
    var vl2= readln().toInt()
    println("Digite o  número:")
    var vl3= readln().toInt()
    println ("Digite o  número:")
    var vl4= readln().toInt()
    println("Digite o número:")
    var vl5= readln().toInt()
    println("Digite o número:")
    var vl6= readln().toInt()
    if(vl1<72){
        soma = vl1 }
    if(vl2< 72 ){
        soma= vl2 }
    if(vl3< 72 ){
        soma =vl3}
    if(vl4< 72 ){
        soma =vl4}
    if(vl5< 72 ){
        soma =vl5}
    if(vl6<72){
        soma =vl6}
    println(" O valor inferior da soma 72 é:$soma")
    println(" Os números informados são: $vl1,$vl2,$vl3,$vl4,$vl5,$vl6")
}