fun main() {
    println("Выберите способ оплаты: ")
    println("1) Наличные ")
    println("2) Кредитная карта ")
    println("3) PayPal ")
    val a = readln().toInt()

    when (a) {
        1 -> println("Вставьте купюры")
        2 -> println("Приложите карту")
        3 -> println("Отсканируйте QR-код")
    }
}