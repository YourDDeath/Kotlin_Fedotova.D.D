fun main() {
    println("Введите строку:")
    val str = readln()
    println("Введите предполагаемую анаграмму:")
    val rts = readln()
    if (isAnagram(str, rts)) println("Строки анаграммы")
    else println("Строки не анаграммы")
}

fun isAnagram(str: String, rts: String): Boolean{
    val sortStr = str.replace(" ","").lowercase().toCharArray().sorted()
    val sortRts = rts.replace(" ","").lowercase().toCharArray().sorted()
    return sortStr == sortRts
}