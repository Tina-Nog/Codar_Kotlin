fun main(){
    //9. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano
    // (não é necessário considerar o mês em que ela nasceu).

            println("Digite seu ano de nascimento:")
    var AnoDeNascimento = readln().toInt()
    if (AnoDeNascimento <=17){
        println("Você pode votar esse ano")
    }
    else{
        println(" Você não pode votar ainda")
    }
}