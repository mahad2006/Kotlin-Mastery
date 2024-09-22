package `08_Functions`

// Function overloading in Kotlin
fun main() {
    // Example 1: Calling overloaded functions
    println("Sum of 3 and 5: ${add(3, 5)}")             // Output: 8
    println("Sum of 3, 5, and 7: ${add(3, 5, 7)}")     // Output: 15
    println("Sum of 2.5 and 3.5: ${add(2.5, 3.5)}")     // Output: 6.0
}

// Overloaded function to add two integers
fun add(a: Int, b: Int): Int {
    return a + b
}

// Overloaded function to add three integers
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// Overloaded function to add two doubles
fun add(a: Double, b: Double): Double {
    return a + b
}

