fun main() {
    var N: Int
    do {
        print("Digite um número inteiro positivo para N: ")
        N = readln().toInt()

        if (N <= 0) {
            println("Número inválido. Digite um número positivo.")
        }
    } while (N <= 0)

    for (v1 in 1..N) {
        println("Tabuada do $v1:")

        for (v2 in 1..10) {
            println("$v1 x $v2 = ${v1 * v2}")


        }
    }
}

