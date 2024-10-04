fun main() {
    println("Введите текст: ")
    val str = readln()
    cipher(str)
}

fun cipher(str: String) {
    val newStr = str.toMutableList()
    val letters = ('а'..'я').toList() + ('А'..'Я').toList()

    for (i in newStr.indices) {
        val index = letters.indexOf(newStr[i])
        if (index != -1) {
            newStr[i] = when {
                index < 32 -> letters[(index + 3) % 32]
                else -> letters[(index + 3) % 32 + 32]
            }
        }
    }

    println(newStr.joinToString(""))
}