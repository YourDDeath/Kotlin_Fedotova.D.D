fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    print("Массив: ")
    for(i in 0..n-1){
        arr[i] = (1..666).random()
        print("${arr[i]}  ")
    }
    val arr2 = arr.filter { it % 2 == 0 }

    print("\nЧётные элементы: $arr2")
    println("\nИх сумма: ${arr2.sum()}")
}