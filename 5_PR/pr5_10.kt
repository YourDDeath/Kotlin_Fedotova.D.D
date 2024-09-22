fun main(){
    print("Введите число: ")
    var n = readln().toInt()
    var a: Int; var sum = 0
    while (n > 0){
        a = n % 10
        sum += a
        n /= 10
    }
    println(sum)
}