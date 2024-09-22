package `02_Variables`

// Variables in Kotlin
fun main() {
    // Declaring variables
    val immutableVariable: Int = 10 // val for immutable (read-only) variable
    var mutableVariable: String = "Kotlin" // var for mutable variable

    println(immutableVariable) // Print immutable variable
    println(mutableVariable) // Print mutable variable

    // Changing mutable variable
    mutableVariable = "Programming"
    println(mutableVariable) // Print updated mutable variable
}
