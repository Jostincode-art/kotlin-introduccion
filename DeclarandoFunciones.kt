fun main(args: Array<String>) {
    printHeader(titulo = "Declarando funciones")
    var resultado = printFooter(titulo = "Función con resultado")
    println(resultado)
}

fun printHeader(titulo: String) {
    println("************************************")
    println("**********  " + titulo + "  **********")
    println("************************************")
}

fun printFooter(titulo: String): String {
    var footer = "************************************\n"
    footer += titulo
    footer += "\n************************************"
    return footer
}
