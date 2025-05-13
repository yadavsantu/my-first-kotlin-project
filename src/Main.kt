fun main() {
    // Numeric types
    val byteVal: Byte = 127
    val shortVal: Short = 30000
    val intVal: Int = 123456
    val longVal: Long = 1234567890L

    val floatVal: Float = 3.14f
    val doubleVal: Double = 3.1415926535

    // Character type
    val charVal: Char = 'K'

    // Boolean type
    val isKotlinFun: Boolean = true

    // String type
    val message: String = "Hello, Kotlin!"

    // Output all values
    println("Byte value: $byteVal")
    println("Short value: $shortVal")
    println("Int value: $intVal")
    println("Long value: $longVal")

    println("Float value: $floatVal")
    println("Double value: $doubleVal")

    println("Char value: $charVal")
    println("Boolean value: $isKotlinFun")
    println("String value: $message")

    // Accessing characters in a string
    println("First letter of message: ${message[0]}")
}