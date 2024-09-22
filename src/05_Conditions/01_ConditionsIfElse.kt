package `05_Conditions`

// if-else condition in Kotlin
fun main() {
    val number = 10

    // Simple if statement
    if (number > 0) {
        println("$number is positive")
    }

    // if-else statement
    if (number < 0) {
        println("$number is negative")
    } else {
        println("$number is positive or zero")
    }

    // if-else if ladder
    val score = 85
    if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else if (score >= 70) {
        println("Grade: C")
    } else {
        println("Grade: F")
    }

    // Kotlin's if as an expression (can return a value)
    val max = if (number > score) number else score
    println("The larger number between $number and $score is $max")
}

