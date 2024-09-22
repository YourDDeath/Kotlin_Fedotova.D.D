fun main(){
    print("Введите любое число: ")
    val N = readln().toInt()
    var f = 1
    for(n in 1..N){
        f *= n
    }
    println("Факториал числа $N = $f")
}