fun main(){
    print("Введите высоту лесницы: ")
    val n = readln().toInt()
    val c = "#"
    for(i in 1..n){
        for(j in 1..i) print(c)
        println()
    }
}