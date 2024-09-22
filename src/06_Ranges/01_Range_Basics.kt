package `06_Ranges`

// Basic usage of ranges in Kotlin
fun main() {
    // Creating a range from 1 to 10
    val range = 1..10

    // Looping through the range
    for (i in range) {
        print("$i ")  // Output: 1 2 3 4 5 6 7 8 9 10
    }
    println()

    // Checking if a value exists within the range
    val number = 5
    if (number in range) {
        println("$number is in the range")
    } else {
        println("$number is not in the range")
    }

    // Using the 'step' function to control increments in a range
    val stepRange = 1..10 step 2
    for (i in stepRange) {
        print("$i ")  // Output: 1 3 5 7 9
    }
    println()

    // Reversed range
    val reversedRange = 10 downTo 1
    for (i in reversedRange) {
        print("$i ")  // Output: 10 9 8 7 6 5 4 3 2 1
    }
}
