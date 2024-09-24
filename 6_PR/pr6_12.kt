fun main(){
    val arr = IntArray(10)
    println("Массив")
    for(i in 0..9){
        arr[i] = (1..10).random()
        print("${arr[i]}  ")
    }
    println("\nМассив после перестановки\n${isSwap(arr)}")
}

fun isSwap(arr: IntArray): String{
    for(i in 0..8 step 2){
        val a = arr[i]
        arr[i] = arr[i+1]
        arr[i+1] = a
    }
    return arr.joinToString("  ")
}