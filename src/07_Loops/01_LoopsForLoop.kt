package `07_Loops`

// Basic usage of for loop in Kotlin
fun main() {
    // Example 1: Loop through a range of numbers
    for (i in 1..5) {
        println("Iteration: $i")  // Output: 1 2 3 4 5
    }

    // Example 2: Loop with a step
    for (i in 1..10 step 2) {
        println("Step iteration: $i")  // Output: 1 3 5 7 9
    }

    // Example 3: Loop through a collection (list of names)
    val names = listOf("Alice", "Bob", "Charlie")
    for (name in names) {
        println("Name: $name")
    }

    // Example 4: Loop through an array with indices
    val numbers = arrayOf(10, 20, 30)
    for (index in numbers.indices) {
        println("Index: $index, Value: ${numbers[index]}")
    }

    // Example 5: Loop in reverse order
    for (i in 5 downTo 1) {
        println("Reverse Iteration: $i")  // Output: 5 4 3 2 1
    }
}

