fun main() {
    println("Введите строку:")
    val s = readln()
    val str = s.replace(" ", "").lowercase()
    val rts = str.reversed()
    if(isPalindrome(str, rts)) println("Строка - палиндром")
    else println("Строка - не палиндром")
}

fun isPalindrome(str: String, rts: String): Boolean{
    for(i in (1.. str.length-1)) {
        if (str[i] != rts[i]) return false
    }
    return true
}