fun main() {
    var total_notas = 2
    var notas: Double
    var soma_notas = 0.0
    var media: Double
    var resposta: String
    var aprovados: Int = 0 // declarado com valor de 0 pois ira armazerar valores dentro da variavel de acordo com alunos apvd

    do { // "do" trabalha junto com "while" para se a resposta for "S"
        // nesse programa permite que o usuario insira outras notas

        for (contador_notas in 1..total_notas.toInt()) {

            print("Informe a nota $contador_notas : ")
            notas = readln().toDouble()

            soma_notas += notas
        }
        media = (soma_notas) / total_notas
        println("A Média do aluno é: $media")

        if (media >= 9.5) { println("Aluno Aprovado!")
            aprovados++ } // Guarda a quantidade de alunos aprovados

        else { println("Aluno Reprovado.") }

        print("Calcular a média de outro aluno Sim/Não? (S/N): ")
        resposta = readln().uppercase() // converte letras minusculas para maiusculas

    } while (resposta == "S")  // Repete o loop se a resposta for "S"
    println("Quantidade de alunos aprovados: $aprovados")



}

