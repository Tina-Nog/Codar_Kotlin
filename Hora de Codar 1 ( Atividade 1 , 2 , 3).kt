fun main() {
    // 1.  Escreva um programa que crie uma variável chamada "nome_do_carro" e atribua-a um valor "Fusca".
//  Exiba-a ao usuário.

    val nomeDoCarro = "fusca"
    println(nomeDoCarro)

    //2. Escreva um programa em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

    println(" Digite seu nome:")
    val nomeDoUsuario= readline()
    println("Olá, ${nomeDoUsuario}")

    // 3. Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário.
// Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

    println("Digite seu nome:")
    val nomeDoUsuario= readln()
    println("Digite sua idade:")
    val idade= readln()
    println(" Olá ${nomeDoUsuario}, sua idade é: ${idade}")
    }
}