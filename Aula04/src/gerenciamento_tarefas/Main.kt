package gerenciamento_tarefas

data class Tarefa(val nome: String, var concluida: Boolean) {
}

fun main() {
    val tarefas = listOf(
        Tarefa("fazer o L", true),
        Tarefa("Rebolar devagarinho", false),
        Tarefa("Explodir", true),
        Tarefa("Almoçar", false)
    )

    println("Tarefas: ")
    tarefas.forEach { println(it) }
    println()

    val pendentes = tarefas.filter { !it.concluida }

    println("Pendentes: ")
    pendentes.forEach { println(it) }
    println()
}