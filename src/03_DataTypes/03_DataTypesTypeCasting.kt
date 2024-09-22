package `03_DataTypes`

// Type Casting in Kotlin
fun main() {
    val number: Any = 5 // 'Any' can hold any type

    // Check the type and cast accordingly
    if (number is Int) {
        println("The number is: $number") // Safe cast
    }
    val input: Any = readln()
    println("the input is $input")
}
