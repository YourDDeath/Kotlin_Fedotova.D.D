fun main() {
    print("Введите первую цифру: ")
    val a = readln().toInt()
    print("Введите вторую цифру: ")
    val b = readln().toInt()
    var pro = 1; var sum = 0
    while (true) {
        sum += a + b
        pro *= a * b
        println("Сумма: $sum")
        print("Произведение: $pro")
        if ((readln() == "стоп") or (readln() == "Стоп")) break
    }
}