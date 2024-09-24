fun main() {
    val arr1 = IntArray(6)
    println("Первый массив")
    for(i in 0..5){
        arr1[i] = (1..10).random()
        print("${arr1[i]}  ")
    }

    val arr2 = IntArray(6)
    println("\nВторой массив")
    for(i in 0..5){
        arr2[i] = (1..10).random()
        print("${arr2[i]}  ")
    }

    val arr = arr1 + arr2
    println("\nИх конкатенация\n${arr.joinToString("  ")}")
}