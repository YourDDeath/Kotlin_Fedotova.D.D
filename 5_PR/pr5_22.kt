fun main(){
    val rand = (1..100).random()
    print("Отгадайте число от 1 до 100: ")
    var n = readln().toInt()

    while (n != rand){
        print("Число неверное, попробуйте ещё раз: ")
        n = readln().toInt()
    }
    println("\nВерно, мы загадали число $rand !!!")
}