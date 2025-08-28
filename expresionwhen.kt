package curso2.kotlin

val edade = 60
val nombres = "maria"

fun main() {
    when (edade) {
        in 1..17 -> println("Menor de edad")
        in 18..59 -> println("Mayor de edad")
        in 60..120 -> println("Tercera edad")
        else -> println("Incorrecto")
    }

    when (nombres.uppercase()) {
        "JUAN", "ALEJANDRO" -> println("hombre")
        "MARIA" -> println("mujer")
        else -> println("no está en la lista")
    }

    val variable: Any = "Hola"
    when (variable) {
        is Int -> println("Entero")
        is String -> println("Texto")
        is Double -> println("Double")
    }

    var can: Any = 10
    when (can) {
        is Int -> println("Entero")
        is String -> println("Texto")
        is Double -> println("Double")
        else -> println("Otro tipo")
    }
}
