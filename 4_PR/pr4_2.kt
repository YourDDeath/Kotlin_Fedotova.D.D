fun main(){
    println("Введите длины сторон треугольника")
    val a = readln()
    val b = readln()
    val c = readln()

    when (a == b){
        true -> when (b == c) {
            true -> println("Треугольник равносторонний")
            false -> println("Треугольник равнобедренный")
        }
        false -> when ((a == c) or (b == c)) {
            true -> println("Треугольник равнобедренный")
            false -> println("Треугольник разносторонний")
        }
    }
}