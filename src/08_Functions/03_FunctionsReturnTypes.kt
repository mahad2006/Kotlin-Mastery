package `08_Functions`

// Function return types in Kotlin
fun main() {
    // Example 1: Returning a value from a function
    val area = calculateArea(5.0, 3.0)
    println("Area: $area")  // Output: Area: 15.0

    // Example 2: Functions with no return type (Unit)
    printMessage("Kotlin is awesome!")  // Output: Message: Kotlin is awesome!
}

// Function that returns a Double value (area of rectangle)
fun calculateArea(length: Double, width: Double): Double {
    return length * width
}

// Function that returns Unit (no return value)
fun printMessage(message: String) {
    println("Message: $message")
}
