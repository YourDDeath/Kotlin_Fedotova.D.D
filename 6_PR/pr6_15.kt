fun main() {
    val arr = IntArray(6)
    println("Введите массив из 6 элементов: ")
    for(i in 0..5){
        arr[i] = readln().toInt()
    }

    if (isPal(arr)) {
        println("\nМассив: ${arr.joinToString(" ")} - является палиндромом")
    } else {
        println("\nМассив: ${arr.joinToString(" ")} - не является палиндромом")
    }
}

fun isPal(arr: IntArray): Boolean {
    for (i in 0..3)
        if (arr[i] != arr[5 - i]) return false
    return true
}