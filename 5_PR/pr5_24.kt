fun main(){
    print("Введите количество строк: ")
    val n = readln().toInt()
    print("Введите количество столбцов: ")
    val m = readln().toInt()
    val a =  Array(n, {Array(m, {0})})
    val b =  Array(m, {Array(n, {0})})
    println("Массив: ")
    for (i in 0..n-1)
        for (j in 0..m-1)
            a[i][j] = (1..100).random()
    isArray(a)
    for (i in 0..n-1)
        for (j in 0..m-1)
            b[j][i] = a[i][j]
    println("Транспонированный массив: ")
    isArray(b)
}

fun isArray(arr: Array<Array<Int>>) {
    val n = arr.size
    val m = arr[0].size
    for (i in 0..n-1) {
        for (j in 0..m-1)
            print("${arr[i][j]} ")
        println("")
    }
}