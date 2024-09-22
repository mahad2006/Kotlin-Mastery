package `08_Functions`

// Declaring and using functions in Kotlin
fun main() {
    // Example 1: A simple function call
    sayHello()  // Output: Hello, World!

    // Example 2: Calling a function that returns a value
    val sum = addNumbers(5, 3)
    println("Sum: $sum")  // Output: Sum: 8
}

// Function that prints a message
fun sayHello() {
    println("Hello, World!")
}

// Function that adds two numbers and returns the result
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}
