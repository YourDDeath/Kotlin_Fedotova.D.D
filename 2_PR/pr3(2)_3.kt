fun main() {
    val a = true
    val b = false
    val c = false

    println("не А и B: ${!a and b}")
    println("А или не B: ${a or !b}")
    println("A и B или С: ${a and b or c}")
}