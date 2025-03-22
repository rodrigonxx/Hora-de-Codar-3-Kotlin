fun main() {
    var v1: Int

    do {
        print("Digite um valor (maior que 100): ")
        v1 = readln().toInt()

        if (v1 <= 100) {
            println("OPS! O NÚMERO É IGUAL OU MENOR QUE 100")
        }
    } while (v1 <= 100)


    for (inteiro in 101..110) {
        println(inteiro)
        Thread.sleep(300)
    }
}