package `04_Operators`

// Unary Operators in Kotlin
fun main() {
    var num = 5

    println("Original value: $num")

    // Unary plus and minus
    println("Unary minus: ${-num}") // Makes the value negative
    println("Unary plus: ${+num}")  // Keeps the value positive

    // Increment and Decrement operators
    num++
    println("After increment: $num") // num = num + 1

    num--
    println("After decrement: $num") // num = num - 1
}
