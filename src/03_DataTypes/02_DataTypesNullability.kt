package `03_DataTypes`

// Nullability in Kotlin
fun main() {
    var nonNullableString: String = "Hello" // Cannot be null
    // nonNullableString = null // Uncommenting this line will cause an error

    var nullableString: String? = "Hello" // Can be null
    nullableString = null // This is allowed

    println(nonNullableString)
    println(nullableString)
}
