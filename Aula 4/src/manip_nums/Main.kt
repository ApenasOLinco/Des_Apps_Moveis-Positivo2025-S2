package manip_nums

fun main() {
    val numeros = listOf(10, 25, 40 , 5, 80)
    val dobrados = numeros.map { it * 2 }
    val maiores30 = dobrados.filter { it > 30 }

    numeros.forEach { println("Numero: $it") }

    println()

    println("Dobrados:")
    dobrados.forEach { println(it) }

    println()

    println("Maiores que 30:")
    maiores30.forEach { println(it) }
}