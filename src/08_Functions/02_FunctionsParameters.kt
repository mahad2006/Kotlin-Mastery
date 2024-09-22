package `08_Functions`

// Function parameters in Kotlin
fun main() {
    // Example 1: Passing arguments to a function
    greetUser("Alice")  // Output: Hello, Alice!

    // Example 2: Passing multiple arguments
    val product = multiplyNumbers(4, 7)
    println("Product: $product")  // Output: Product: 28

    // Example 3: Using default parameter values
    greetUser()  // Output: Hello, Guest!
}

// Function with a parameter
fun greetUser(name: String = "Guest") {
    println("Hello, $name!")
}

// Function with multiple parameters
fun multiplyNumbers(a: Int, b: Int): Int {
    return a * b
}
