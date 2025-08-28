fun main(args: Array<String>) {

    bucle@ for (i in 1..18) {          // primer bucle con etiqueta

        for (j in 1..18) {             // segundo bucle

            if (i == 5 && j == 5) {
                println("Estamos en la mitad")
                break@bucle            // rompe el bucle exterior
            } else {
                println("i=$i, j=$j")
            }
        }
    }
}