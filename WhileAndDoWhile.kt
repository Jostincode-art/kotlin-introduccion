fun main(args: Array<String>) {
    var i = 10

    // WHILE
    while (i > 0) {
        println(i)
        i--   // aquí decrementamos la variable
    }

    // reiniciamos i
    i = 18

    println("* DO...WHILE *")

    // DO WHILE
    do {
        println(i)
        i--
    } while (i > 0)
}