fun main() {
    val x = false
    val y = false
    val z = true

    println("X или Y и не Z: ${x or y and !z}")
    println("X и не Y или Z: ${x and !y or z}")
    println("не X и не Y: ${!x and !y}")
    println("X и (не Y или Z): ${x and (!y or z)}")
    println("не (X и Z) или Y: ${!(x and z) or y}")
    println("X или (не (Y или Z)): ${x or (!(y or z))}")
}