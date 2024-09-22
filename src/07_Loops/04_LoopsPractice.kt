package `07_Loops`

// Practice exercises for loops in Kotlin
fun main() {
    // Task 1: Print the first 10 even numbers using a for loop
    for (i in 2..20 step 2) {
        print("$i ")  // Output: 2 4 6 8 10 12 14 16 18 20
    }
    println()

    // Task 2: Using a while loop to print numbers from 10 down to 1
    var j = 10
    while (j >= 1) {
        print("$j ")  // Output: 10 9 8 7 6 5 4 3 2 1
        j--
    }
    println()

    // Task 3: Using a do-while loop to take user input until -1 is entered
    var userInput: Int
    do {
        println("Enter a number (-1 to stop):")
        userInput = readLine()!!.toInt()
        println("You entered: $userInput")
    } while (userInput != -1)
}
