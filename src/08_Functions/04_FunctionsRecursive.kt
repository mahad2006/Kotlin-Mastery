package `08_Functions`

// Recursive functions in Kotlin
fun main() {
    // Example 1: Calculating factorial using recursion
    val number = 5
    val result = factorial(number)
    println("Factorial of $number is: $result")  // Output: Factorial of 5 is: 120
}

// Recursive function to calculate factorial of a number
fun factorial(n: Int): Int {
    return if (n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
