fun main() {
    println("Введите число от 1 до 10: ")
    val a = readln().toInt()

    when (a) {
        6 -> println("Ты чёткий чел <3")
        8 -> println("8>Бесконечность не предел<8")
        else -> println("Ты просто нулёвый чел...")
    }
}