fun main() {
    println("Введите группу крови: ")
    val a = readln().toString()

    when (a) {
        "A" -> println("Для переливания подойдут группы: A, O")
        "B" -> println("Для переливания подойдут группы: B, O")
        "AB" -> println("Для переливания подойдут группы: A, B, AB, O")
        "O" -> println("Для переливания подойдут группы: O")
    }
}