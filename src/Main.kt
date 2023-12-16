fun main() {

    /**
     * Kotlin possui tipagem dinamica
     *
     * Int, Float, Long, String, Boolean
     */
    val nome = "Flavio Ever B"
    var nome2 = "Kalita Trevisan"
    var numeroTipado: Int = 9999

    println("$nome, $nome2, $numeroTipado")

    /**
     * Operadores logicos
     * >, <, ==, !=, >=, <=, ||
     */

    val valor1 = 21;
    val valor2 = 20;

    println(valor1 >= valor2)

    if(valor1 >= valor2) {
        println("verdadeiro")
    } else {
        println("falso")
    }

    val sexo = "masculino"

    if(sexo == "masculino") {
        println("Sexo $sexo")
    } else if(sexo == "Feminino") {
        println("Sexo $sexo")
    }

    /**
     * Estruturas de repeticao
     */

    var contador = 0
    while(contador < 5) {
        println("Contador while $contador")
        contador++
    }

    for(contador in 0..5){
        println("Contador for $contador")
    }

    /**
     * Listas
     */
    var nomes = arrayOf("Flavio", "Maria", "Pedro")

    println(nomes[0])

    /**
     * When
     */
    var opcao = 0
    when(opcao) {
        1 -> println("Suco de laranja")
        2 -> println("Suco de uva")
        3 -> println("Suco de maracuja")
        else -> println("Nenhuma opcao")
    }

    /**
     * Funcoes
     */
    qualOSeuNome("Flavio")

    /**
     * Classes
     */
    val carro = Carro()
    carro.cor = "Azul"

    println(carro.cor)

    carro.abrirPorta()
    carro.marchas()
}

fun qualOSeuNome(nome: String) {
    println("Meu nome é $nome")
}

class Carro {
    var cor: String = ""

    fun abrirPorta() {
        println("Abrir porta do carro")
    }

    fun primeiraMarcha() {
        println("Primeira marcha")
    }

    fun segundaMarcha() {
        println("Segunda marcha")
    }

    fun marchas() {
        this.primeiraMarcha()
        this.segundaMarcha()
    }
}