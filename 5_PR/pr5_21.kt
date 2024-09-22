fun main(){
    print("Введите год: ")
    val y = readln().toInt()
    print("Введите месяц: ")
    val m = readln().toInt()
    for(i in 1..31){
        println("$i.$m.$y")
        if((m == 2) and (i == 29) and (isYear(y))) break
        else if((m == 2) and (i == 28) and (isYear(y) == false)) break
        else if((isMonth(m)) and (i == 30)) break
    }
}

fun isYear(y: Int): Boolean {
    return ((y % 4 == 0) and (y % 100 != 0) or (y % 400 == 0))
}

fun isMonth(m: Int): Boolean {
    if((m < 8) and (m % 2 == 0)) return true
    else if((m > 7) and (m % 2 != 0)) return true
    else return false
}