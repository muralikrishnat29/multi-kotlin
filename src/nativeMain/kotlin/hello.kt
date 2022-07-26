
fun main() {
    val someContent = SomeContent("Native endpoint")
    println("Hello, Kotlin/Native ${someContent.data}!")
    println("Enter your name:")
    val name = readln()
    // Count the letters in the name.
    name.replace(" ", "").let {
        println("Your name contains ${it.length} letters")
    }
}