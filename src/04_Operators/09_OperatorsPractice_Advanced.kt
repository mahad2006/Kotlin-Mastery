package `04_Operators`

// Practice file for advanced operators
fun main() {
    var x = 10

    // Practice with unary operators
    println("x after unary minus: ${-x}")
    println("x after increment: ${++x}")
    println("x after decrement: ${--x}")

    // Bitwise operations practice
    val a = 12
    val b = 7
    println("a AND b: ${a and b}")
    println("a OR b: ${a or b}")
    println("a XOR b: ${a xor b}")
    println("a shifted left by 2: ${a shl 2}")
    println("a shifted right by 1: ${a shr 1}")

    // Range operator practice
    val range = 1..10
    println("Is 5 in the range? ${5 in range}")
    println("Is 15 in the range? ${15 in range}")
}
