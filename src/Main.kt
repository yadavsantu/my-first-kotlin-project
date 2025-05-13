fun main() {
    println("Followings are the basic data types in kotlin")
   displayBasicDataTypes()
    collectionsInKotlin()
}
fun displayBasicDataTypes(){
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
fun collectionsInKotlin(){
    println("Lists in Kotlin")
    //lists
    //read-only lists
    val readOnlyShapes=listOf<String>("Triangle","Square","Circle")
    println(readOnlyShapes)
    //mutable lists
    val shapes: MutableList<String> =mutableListOf("triangle","square","circle")
    shapes.add("Rectangle")
    println(shapes)
    val shapesLocked: List<String> = shapes // shapesLocked is now read-only list
    println(shapesLocked)

}