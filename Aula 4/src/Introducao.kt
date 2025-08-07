fun main() {
    fazAlgo(3, 5) {
        valor, outroNumero -> println("Ola $valor - $outroNumero")
    }
}

fun fazAlgo(a: Int,b: Int, funcao: (Int, Int) -> Unit) {
    println(a + b)
    for(i in 1..5) {
        funcao(i, 2)
    }
}