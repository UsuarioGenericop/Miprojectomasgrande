package com.example.miprojectomasgrande.examples

fun maino() {
    for (i in 0..20) {
        if (i % 2 == 0) {
            println("$i es numero par")
        } else {
            println("$i es un numero impar")

        }

    }
}

fun maina() {
    var edades: Array<Int> = arrayOf(15, 16, 7, 22, 35, 30)
    var nombres: Array<String> = arrayOf("aa", "bb", "cc", "dd", "ee", "ff")
    for (a in 0..5)
        println("${edades[a]} -${nombres[a]} ")
    var numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for (c in 0..numeros.size - 1)
        println("${numeros[c]}")
    println()
    for (d in 4 downTo 0)
        println("${numeros[d]}")
    var paginas: Array<Int> = arrayOf(11, 31, 313, 13, 1, 321, 3213, 1, 5665)
    for (e in 0..8)
        println("${paginas[e]}")


}

fun main() {

    var dias: ArrayList<String> = arrayListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    for (dia in dias)
        print("${dia} ")
    println()
    dias.add("Sabado")
    dias.remove("Lunes")
    for (dia in dias)
        print("${dia} ")
    println()
    dias.add("Domingo")
    for (dia in dias)
        print("${dia} ")
    println()
    dias.add(0, "Lunes")
    for (dia in dias)
        print("${dia} ")

    var rrra: Array<Int> = arrayOf(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
        21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
        31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
        41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
        51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
        61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
        71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
        81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
        91, 92, 93, 94, 95, 96, 97, 98, 99
    )
    println(rrra)
}