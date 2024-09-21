fun main() {
    println("1) Яйцо в мешочек ")
    println("2) Яйцо всмятку ")
    println("3) Яйцо вкрутую ")
    println("Введите номер: ")
    val a = readln().toInt()

    when (a) {
        1 -> println("Варить 3-4 минуты")
        2 -> println("Варить 5-6 минут")
        3 -> println("Варить 10-12 минут")
    }
}