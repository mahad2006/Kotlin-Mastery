package `04_Operators`

// Range Operator in Kotlin
fun main() {
    val range = 1..5 // Creates a range from 1 to 5
    println("Range from 1 to 5: $range")

    // Iterating through a range using for loop
    for (i in range) {
        println(i)
    }

    // Using 'in' operator to check if a value is in the range
    println("Is 3 in range? ${3 in range}") // true
    println("Is 6 in range? ${6 in range}") // false
}
