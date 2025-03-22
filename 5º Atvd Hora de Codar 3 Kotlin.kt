fun main() {

    var n1: Double
    var n2: Double
    var resu: Double

    print("Informe o 1º Número: ")
    n1 = readln().toDouble()

    print("Informe o 2º Número (Deve ser Maior que o 1º Número): ")
    n2 = readln().toDouble()

    while  (n1 > n2) { println ("Valor inválido! O segundo valor deve ser maior que o 1º Número.")

    print("Ops! Tente Novamente: ")
        n2 = readln().toDouble()
    }
    resu = (n1 + n2)/2

        println("A média aritmética dos valores é: $resu" )

}
