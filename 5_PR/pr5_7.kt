fun main(){
    print("Введите количество чисел Фибоначчи: ")
    val n = readln().toInt()
    var a = 1; var b = 1; var c = 1
    print("0\t1\t")
    for (i in 4..n) {
        print("$a\t")
        b = c
        a += b
        c = a
    }
}