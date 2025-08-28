package curso2.kotlin

val sesionIniciada = false
val credencialDescuento = true
val eda = 70

fun main() {
    /*if (sesionIniciada == true)
        println("Bienvenido")
    else
        println("Inicia sesión")*/
    /*if (eda < 18) {
        println("Menor de edad")
    } else if (eda < 60) {
        println("Mayor de edad")
    } else {
        println("Tercera edad")
    }*/
    // Se cumple solo si ambas condiciones son verdaderas
    /*if (eda >= 60 && credencialDescuento == true) {
        println("Descuento")
    } else {
        println("No aplica")
    }
    if (edad >= 60 || credencialDescuento == true) {
        println("Descuento")
    } else {
        println("No aplica")
    }*/
    if (!sesionIniciada) {
        println("Debes iniciar sesión")
    } else {
        println("Bienvenido")
    }

}
