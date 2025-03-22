fun main() {

    var acumuladora = 0
    var quantidade = 0


    for (numero in 15..100) {
        acumuladora += numero // acumular cada número
        quantidade++  // quantidade de números entre 15 e 100
    }


    val media = acumuladora.toDouble() / quantidade


    println("A média aritmética dos números inteiros entre 15 e 100 é: $media")
}