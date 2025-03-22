fun main() {

    var vl = 10
    var vl1: Int
    var DentroIntervalo = 0
    var ForaIntervalo = 0

    for (contador in 1..vl.toInt()) {

        print("Informe o $contador º valor : ")
        vl1 = readln().toInt()

        if (vl1 >= 24 && vl1 <= 42) { DentroIntervalo++ }

        else { ForaIntervalo++ }
    }
    println("Quantidade de valores dentro do intervalo [24, 42]: $DentroIntervalo")
    println("Quantidade de valores fora do intervalo [24, 42]: $ForaIntervalo")
}
