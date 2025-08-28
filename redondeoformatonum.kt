package curso2.kotlin

import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    val resultado = 10.0 / 3.0

    val formato = DecimalFormat("#.##")
    formato.roundingMode = RoundingMode.FLOOR

    println(formato.format(resultado))
}
