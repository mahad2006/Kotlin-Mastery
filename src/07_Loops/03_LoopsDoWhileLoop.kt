package `07_Loops`

// Using do-while loop in Kotlin
fun main() {
    var i = 1

    // Example 1: Basic do-while loop
    do {
        println("Do-While Iteration: $i")  // Output: 1 2 3 4 5
        i++
    } while (i <= 5)

    // Example 2: A loop that executes at least once
    var userInput: Int
    do {
        println("Enter a number (-1 to stop):")
        userInput = readLine()!!.toInt()
        println("You entered: $userInput")
    } while (userInput != -1)
}

