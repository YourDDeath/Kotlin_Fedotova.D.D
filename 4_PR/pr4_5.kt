fun main() {
    println("Введите число: ")
    val a = readln().toInt()

    when (a > 0) {
        true -> println("Число положительное")
        false -> when (a < 0){
            true -> println("Число отрицательное")
            false -> println("Ваше число - 0")
        }
    }
}