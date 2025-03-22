fun main() {

    val v1: Double // val para uma variável cujo valor nunca muda.
    val resu: Double
    var v2: Double // var para uma variável cujo valor possa ser mudado.

    print("Informe o 1º valor: ")
    v1 = readLine()!!.toDouble()

    print("Informe o 2º valor (deve ser maior que zero): ")
    v2 = readLine()!!.toDouble()

    // WHILE é usada quando não sabemos quantas vezes um determinado bloco de instruções precisa ser repetido.
    // Com ele, a execução das instruções vai continuar até que uma condição seja verdadeira

    while (v2 <= 0) { println("Valor inválido! O segundo valor deve ser maior que zero.")

        print("Informe o segundo valor novamente: ")
        v2 = readLine()!!.toDouble()
    }
    resu = v1 / v2

    println("O resultado da divisão de $v1 por $v2 é: $resu")
}