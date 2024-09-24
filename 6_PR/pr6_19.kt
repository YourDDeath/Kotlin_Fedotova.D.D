fun main() {
    var arr1 = IntArray(6)
    println("Первый массив")
    for(i in 0..5){
        arr1[i] = (1..100).random()
        print("${arr1[i]}  ")
    }
    arr1 = arr1.sortedArray()
    println("\nОтсортированный первый массив \n${arr1.joinToString("  ")}")

    var arr2 = IntArray(6)
    println("\nВторой массив")
    for(i in 0..5){
        arr2[i] = (1..100).random()
        print("${arr2[i]}  ")
    }
    arr2 = arr2.sortedArray()
    println("\nОтсортированный второй массив \n${arr2.joinToString("  ")}")

    var arr = IntArray(12)
    arr = arr1 + arr2
    println("\nДва массива \n${arr.joinToString("  ")}")
    arr = arr.sortedArray()
    println("Отсортированные массив \n${arr.joinToString("  ")}")
}