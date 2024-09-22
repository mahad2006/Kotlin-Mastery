package `06_Ranges`

// Using ranges in conditions
fun main() {
    val age = 25

    // Using range in if-else conditions
    if (age in 13..19) {
        println("Teenager")
    } else if (age in 20..29) {
        println("Young Adult")
    } else {
        println("Not in the target age group")
    }

    // Using range in when expression
    val score = 85
    when (score) {
        in 90..100 -> println("Grade: A")
        in 80..89 -> println("Grade: B")
        in 70..79 -> println("Grade: C")
        else -> println("Fail")
    }

    // Checking if a number is within a specific range
    val temperature = 35
    when {
        temperature in -10..0 -> println("It's freezing cold")
        temperature in 1..20 -> println("It's cold")
        temperature in 21..30 -> println("It's warm")
        temperature in 31..40 -> println("It's hot")
        else -> println("Extreme temperature")
    }
}
