package curso2.kotlin

val nombre = "Juan"
val edad = 25
val dinero = 25.50

fun main() {
    val ruta = """
        Nombre: $nombre
        Edad: $edad
    """.trimIndent()

    val ruta2 = "Nombre: " + nombre + "\nEdad: " + edad

    println(ruta2)
}
