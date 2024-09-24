fun main(){
    val arr = IntArray(10)
    var sum = 0; var pro = 1
    print("Массив: ")

    for(i in 0..9){
        arr[i] = (1..10).random()
        print("${arr[i]}  ")
        sum += arr[i]
        pro *= arr[i]
    }

    println("\nСумма элементов: $sum ")
    println("Произведение элементов: $pro ")
}