
fun main() {
    val totalNotas = 6 //Define o número total de notas que serão lidas (6 no caso).
    var somaNotas = 0.0 //Variável que armazena a soma das notas válidas.
    var nota: Double

    for (contador_notas in 1..totalNotas) { // Itera 6 vezes para ler cada uma das notas.

        do {
            print("Digite a nota $contador_notas (0 a 10): ")
            nota = readln().toDouble()

            if (nota < 0 || nota > 10) {

                println("Ops! Nota inválida! A nota deve estar entre 0 e 10.")
            }
        } while (nota < 0 || nota > 10)

        somaNotas += nota
        //Ela faz o seguinte:
        //1 Pega o valor atual da variável somaNotas.
        //2 Adiciona o valor da variável nota a esse valor.
        //3 Atualiza a variável somaNotas com o resultado da soma.
        //somaNotas += nota é o mesmo que somaNotas = somaNotas + nota

    }

    val media = somaNotas / totalNotas
    println("A média do aluno é: $media")
}