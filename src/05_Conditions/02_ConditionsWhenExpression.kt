package `05_Conditions`

// when expression in Kotlin
fun main() {
    val day = 3

    // Simple when statement (like switch in other languages)
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }

    // when as an expression that returns a value
    val result = when (day) {
        1, 2, 3, 4, 5 -> "Weekday"
        6, 7 -> "Weekend"
        else -> "Unknown"
    }
    println("It's a $result")

    // when with different types of conditions
    val age = 20
    when {
        age < 13 -> println("Child")
        age in 13..19 -> println("Teenager")
        age >= 20 -> println("Adult")
        else -> println("Invalid age")
    }
}

