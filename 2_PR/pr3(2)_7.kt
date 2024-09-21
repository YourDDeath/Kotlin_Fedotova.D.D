fun main() {
    val a = true
    val b = false
    val c = false

    println("A или не (А и B) или С: ${a or !(a and b) or c}")
    println("не А или А и (В или С): ${!a or a and (b or c)}")
    println("(А или B и не C) и C: ${(a or b and !c) and c}")
}