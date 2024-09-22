package `05_Conditions`

// Practice exercises for if-else and when conditions
fun main() {
    // Task 1: Using if-else to determine even or odd
    val num = 11
    if (num % 2 == 0) {
        println("$num is even")
    } else {
        println("$num is odd")
    }

    // Task 2: Using when to categorize a number as positive, negative, or zero
    val number = -5
    when {
        number > 0 -> println("$number is positive")
        number < 0 -> println("$number is negative")
        else -> println("$number is zero")
    }

    // Task 3: Grading system using if-else
    val marks = 72
    val grade = if (marks >= 90) {
        "A"
    } else if (marks >= 80) {
        "B"
    } else if (marks >= 70) {
        "C"
    } else {
        "Fail"
    }
    println("Grade: $grade")

    // Task 4: Using when to match string conditions
    val season = "Spring"
    val activity = when (season) {
        "Winter" -> "Skiing"
        "Spring" -> "Hiking"
        "Summer" -> "Swimming"
        "Autumn" -> "Leaf Peeping"
        else -> "Unknown activity"
    }
    println("In $season, you can go $activity")
}

