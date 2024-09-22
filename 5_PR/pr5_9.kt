fun main(){
    print("Введите текст: ")
    val str = readln().toString()
    val rts = StringBuilder()
    for(i in str.length - 1 downTo 0){
        rts.append(str[i])
    }
    println(rts)
}