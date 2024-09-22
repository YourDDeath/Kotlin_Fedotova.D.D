fun main(){
    print("Введите начальное число: ")
    var num = readln().toInt()
    print("Введите шаг: ")
    val m = readln().toInt()
    print("Введите количество чисел: ")
    val n = readln().toInt()
    print("$num\t")
    for (i in 2..n){
        num += m
        print("$num\t")
    }
}