fun main() {
    print("Enter a three-digit number: ")
    val num = readln().toInt()
    println(num%10)
    println((num%100)/10)
    println((num/100)+((num%100)/10)+(num%10))
    println((num/100)*((num%100)/10)*(num%10))
}