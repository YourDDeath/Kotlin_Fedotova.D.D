fun main(){
    val arr = IntArray(10)
    println("Массив")
    for(i in 0..9){
        arr[i] = (1..100).random()
        print("${arr[i]}  ")
    }
    println("\nЧисла, кратные трём")
    for(i in 0..9){
        if (arr[i] % 3 == 0) print("${arr[i]}  ")
    }
}