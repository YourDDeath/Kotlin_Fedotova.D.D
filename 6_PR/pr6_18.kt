fun main(){
    val arr = IntArray(25)
    var n = 0
    print("Массив: ")

    for(i in 0..24){
        arr[i] = (10..99).random()
        print("${arr[i]}  ")
    }
    println("\nГруппы в массиве:\n")

    for(i in 0..24){
        print("${arr[i]}  ")
        n++

        if (n == 5){
            println("")
            n = 0
        }
    }
}