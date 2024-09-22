fun main() {
    print("Введите нижнюю границу диапазона: ")
    val a = readln().toInt()
    print("Введите верхнюю границу дипазона: ")
    val b = readln().toInt()
    for (n in a..b)
        if (isSimp(n)) println(n)
}

fun isSimp(n: Int): Boolean {
    if (n == 1) return false
    else {
        for(i in 1..n-1) {
            if (i == 1)continue
            else if (n % i == 0) return false
        }
    }
    return true
}