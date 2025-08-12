package process_str_obj

class Produto(val nome: String, val preco: Double) {
}

fun main() {
    val produtos = listOf<Produto>(
        Produto("Cocacola espuma", 14.50),
        Produto("Canetão", 5.00),
        Produto("Caderninho", 15.00),
        Produto("Agenda", 20.00),
        Produto("Granada", 100.00)
    )
    println("Produtos:")
    produtos.forEach { println(it) }
    println()

    val caros = produtos.filter { it.preco > 50 }
    println("Caros:")
    caros.forEach { println(it) }
    println()

    val nomes = caros.map { it.nome }
    println("Nomes caros:")
    nomes.forEach { println(it) }
    println()
}