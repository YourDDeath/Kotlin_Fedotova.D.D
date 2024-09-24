fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    println("Массив: ")
    for(i in 0..n-1){
        arr[i] = (1..666).random()
        print("${arr[i]}  ")
    }
    val arrCop =IntArray(n)
    println("\nСкопированный массив: ")
    for(i in 0..n-1){
        arrCop[i] = arr[i]
        print("${arrCop[i]}  ")
    }
}