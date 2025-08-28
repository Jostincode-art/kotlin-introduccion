fun main(args: Array<String>) {

    // Operación con Float
    var operando1: Float
    var operando2: Float

    operando1 = 4.5f
    operando2 = 12.2f

    var resultado: Float = sumaFloat(operando1, operando2)
    println("Suma = " + resultado)

    // Operación con Double
    var operando3: Double
    var operando4: Double

    operando3 = 5.5
    operando4 = 12.5

    var resultadosuma: Double = sumaDouble(operando3, operando4)
    println("Sumadouble = " + resultadosuma)
}

fun sumaDouble(operando3: Double, operando4: Double): Double {
    return operando3 + operando4
}

fun sumaFloat(operando1: Float, operando2: Float): Float {
    return operando1 + operando2
}