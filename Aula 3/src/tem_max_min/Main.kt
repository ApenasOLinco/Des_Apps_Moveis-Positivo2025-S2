package tem_max_min

import kotlin.math.max
import kotlin.math.min

fun main() {
    val temperaturas = listOf(20.0, 10.0, 15.0)

    var menor: Double = Double.MAX_VALUE
    var maior: Double = Double.MIN_VALUE
    temperaturas.forEach {
        menor = min(it, menor)
        maior = max(it, maior)
    }

    println("Maior temperatura: $maior")
    println("Menor temperatura: $menor")
}