fun main(){
    print("Введите количество чисел: ")
    val n = readln().toInt()
    val arr = arrayOfNulls<Int>(n)
    println("Введите числа: ")
    for (i in 0..n-1){
        arr[i] = readln().toInt()
    }
    arr.sort()
    println("Отсоритрованная последовательность: ")
    for (i in arr){
        print("$i ")
    }
}
