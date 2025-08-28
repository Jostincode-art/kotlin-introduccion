package curso2.kotlin

fun main() {
    // Variables mutables (var) y constantes inmutables (val)
    var edad: Int = 20
    val nombre: String = "Jostin"

    // Tipos de datos básicos
    val pi: Double = 3.1416
    var temperatura: Float = 36.5f
    val inicial: Char = 'J'
    var esMayorDeEdad: Boolean = true

    // Operaciones con enteros
    edad += 5 // sumando 5 a la edad

    // Mostrar resultados
    println("Nombre: $nombre")
    println("Inicial: $inicial")
    println("Edad actual: $edad")
    println("¿Es mayor de edad?: $esMayorDeEdad")
    println("Valor de Pi: $pi")
    println("Temperatura corporal: $temperatura °C")

    // Ejemplo con String
    val mensaje: String = "Hola, mi nombre es $nombre y tengo $edad años."
    println(mensaje)
}
