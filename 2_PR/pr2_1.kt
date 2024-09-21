fun main() {
    print("Enter a two-digit number: ")
    val num = readln().toInt()
    println(num/10)
    println(num%10)
    println((num/10)+(num%10))
    println((num/10)*(num%10))
}