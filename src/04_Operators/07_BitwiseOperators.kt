package `04_Operators`

// Bitwise Operators in Kotlin
fun main() {
    val a = 5 // In binary: 0101
    val b = 3 // In binary: 0011

    // Bitwise AND
    println("a AND b: ${a and b}") // 0101 AND 0011 = 0001 (1 in decimal)

    // Bitwise OR
    println("a OR b: ${a or b}") // 0101 OR 0011 = 0111 (7 in decimal)

    // Bitwise XOR
    println("a XOR b: ${a xor b}") // 0101 XOR 0011 = 0110 (6 in decimal)

    // Bitwise inversion
    println("Inversion of a: ${a.inv()}") // Inverts the bits of a

    // Left shift and right shift
    println("a shifted left by 1: ${a shl 1}") // 0101 becomes 1010 (10 in decimal)
    println("a shifted right by 1: ${a shr 1}") // 0101 becomes 0010 (2 in decimal)
}
