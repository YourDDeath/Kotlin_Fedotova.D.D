fun main(){
    val arr = IntArray(20)
    print("Массив: ")
    for(i in 0..19){
        arr[i] = (1..100).random()
        print("${arr[i]}  ")
    }
}