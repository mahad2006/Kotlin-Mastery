package `06_Ranges`

// Character ranges in Kotlin
fun main() {
    // Creating a range of characters from 'a' to 'z'
    val charRange = 'a'..'z'

    // Looping through the character range
    for (ch in charRange) {
        print("$ch ")  // Output: a b c d e f g h i j k l m n o p q r s t u v w x y z
    }
    println()

    // Checking if a character exists in the range
    val letter = 'k'
    if (letter in charRange) {
        println("$letter is in the range")
    } else {
        println("$letter is not in the range")
    }

    // Using reversed character ranges
    val reversedCharRange = 'z' downTo 'a'
    for (ch in reversedCharRange) {
        print("$ch ")  // Output: z y x w v u t s r q p o n m l k j i h g f e d c b a
    }
}
