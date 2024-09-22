package `08_Functions`

// Practice exercises for functions in Kotlin
fun main() {
    // Task 1: Write a function that calculates the square of a number
    val square = squareOfNumber(4)
    println("Square of 4: $square")  // Output: Square of 4: 16

    // Task 2: Write a function that checks if a number is even
    val number = 7
    val isEven = checkEven(number)
    println("Is $number even? $isEven")  // Output: Is 7 even? false

    // Task 3: Write a recursive function to calculate the sum of numbers from 1 to n
    val sumResult = sumOfNumbers(5)
    println("Sum of numbers from 1 to 5: $sumResult")  // Output: 15
}

// Function to calculate the square of a number
fun squareOfNumber(n: Int): Int {
    return n * n
}

// Function to check if a number is even
fun checkEven(n: Int): Boolean {
    return n % 2 == 0
}

// Recursive function to calculate the sum of numbers from 1 to n
fun sumOfNumbers(n: Int): Int {
    return if (n == 1) {
        1
    } else {
        n + sumOfNumbers(n - 1)
    }
}
