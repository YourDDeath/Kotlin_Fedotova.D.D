fun main(){
    print("Введите число: ")
    val n = readln().toInt()
    var sum1 = 0; var sum2 = 0
    for (i in 1..n){
        if(i % 2 != 0) sum1 += i
        else sum2 += i
    }
    println("Сумма нечётных чисел в пределах $n = $sum1")
    println("Сумма чётных чисел в пределах $n = $sum2")
}