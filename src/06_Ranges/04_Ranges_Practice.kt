package `06_Ranges`

// Practice exercises for ranges in Kotlin
fun main() {
    // Task 1: Check if a number is in a range of 50 to 100
    val num = 65
    if (num in 50..100) {
        println("$num is in the range of 50 to 100")
    } else {
        println("$num is outside the range")
    }

    // Task 2: Use a step range to print even numbers from 2 to 20
    val evenRange = 0..20 step 2
    for (i in evenRange) {
        print("$i ")  // Output: 0 2 4 6 8 10 12 14 16 18 20
    }
    println()

    // Task 3: Using a character range to check if a letter is a vowel
    val vowelRange = 'a'..'e'
    val letter = 'c'
    if (letter in vowelRange) {
        println("$letter is within the first five letters of the alphabet")
    } else {
        println("$letter is outside the first five letters")
    }
}
