fun main() {
    var N: Int

    print("Digite um valor para N (maior que 0): ")
    N = readln().toInt()


    if (N > 0) {

        for (inteiro in 1..N) {

            Thread.sleep(300)
            println(inteiro)
        }

    }
    while (N <= 0) {
        println ("OPS! O NÚMERO É IGUAL OU MENOR QUE 0")
        print ("Digite um valor para N (maior que 0):  ")
        N = readln().toInt()
    }
}

