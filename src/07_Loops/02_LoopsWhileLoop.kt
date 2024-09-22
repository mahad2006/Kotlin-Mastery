package `07_Loops`

// Using the while loop in Kotlin
fun main() {
    var i = 1

    // Example 1: Simple while loop
    while (i <= 5) {
        println("While Iteration: $i")  // Output: 1 2 3 4 5
        i++
    }

    // Example 2: Using while to check conditions
    var userInput = 0
    while (userInput != -1) {
        println("Enter a number (-1 to stop):")
        userInput = readLine()!!.toInt()
        println("You entered: $userInput")
    }

    // Example 3: Looping through a list using while loop
    val list = listOf(1, 2, 3, 4)
    var index = 0
    while (index < list.size) {
        println("Value at index $index: ${list[index]}")
        index++
    }
}
