fun main() {
    println("Введите слово (не больше 10 букв): ")
    val str = readln().toString()
    val a = str.count().toInt()

    when (a) {
        1 -> println("В вашем слове одна буква")
        2 -> println("В вашем слове две буквы")
        3 -> println("В вашем слове три буквы")
        4 -> println("В вашем слове четыре буквы")
        5 -> println("В вашем слове пять букв")
        6 -> println("В вашем слове шесть букв")
        7 -> println("В вашем слове семь букв")
        8 -> println("В вашем слове восемь букв")
        9 -> println("В вашем слове девять букв")
        10 -> println("В вашем слове десять букв")
    }
}