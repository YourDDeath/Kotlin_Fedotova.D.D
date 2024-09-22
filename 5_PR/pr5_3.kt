fun main(){
    print("Введите любое число: ")
    val N = readln().toInt()
    var sum = 0
    for(n in 1..N){
        sum += n
    }
    println("Сумма чисел $N = $sum")
}