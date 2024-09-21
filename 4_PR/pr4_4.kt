fun main() {
    println("Введите время в сутках: ")
    val a = readln().toInt()

    when (a) {
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..23 -> println("Вечер")
        in 0..5 -> println("Ночь")
    }
}