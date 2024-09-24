fun main(){
    val arr = IntArray(10)
    print("Неотсортированный массив: ")
    for (i in 0..9){
        arr[i] = (1..10).random()
        print("${arr[i]} ")
    }
    println("\nСреднее aрифметическое чисел массива: ${isSA(arr)}")
}

fun isSA(arr: IntArray): Int {
    val sum = arr.sum()
    val s = sum/10
    return s
}