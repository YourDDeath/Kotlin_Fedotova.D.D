fun main(){
    val arr = IntArray(5)
    print("Массив: ")
    for(i in 0..4){
        arr[i] = (1..666).random()
        print("${arr[i]}  ")
    }
}