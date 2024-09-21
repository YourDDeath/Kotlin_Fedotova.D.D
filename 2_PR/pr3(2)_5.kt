fun main() {
    val x = true
    val y = true
    val z = false

    println("не X и Y: ${!x and y}")
    println("X или не Y: ${x or !y}")
    println("X или Y и Z: ${x or y and z}")
}