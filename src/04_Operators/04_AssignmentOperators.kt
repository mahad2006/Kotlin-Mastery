package `04_Operators`

// Assignment Operators in Kotlin
fun main() {
    var num = 10

    num += 5 // Equivalent to num = num + 5
    println("After += : $num")

    num -= 3 // Equivalent to num = num - 3
    println("After -= : $num")

    num *= 2 // Equivalent to num = num * 2
    println("After *= : $num")

    num /= 4 // Equivalent to num = num / 4
    println("After /= : $num")

    num %= 3 // Equivalent to num = num % 3
    println("After %= : $num")
}
