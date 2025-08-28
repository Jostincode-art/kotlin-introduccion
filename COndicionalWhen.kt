fun main(args: Array<String>) {
    val password = "ee34rf6dd"

    when (password.length) {
        0 -> println("Contraseña vacía")
        in 1..4 -> println("Contraseña muy débil")
        in 5..6 -> println("Contraseña débil")
        else -> println("Contraseña segura")
    }

    esPar(numero = 23246)
}

fun esPar(numero: Int) = when (numero % 2) {
    0 -> println("El número es par")
    else -> println("El número es impar")
}
