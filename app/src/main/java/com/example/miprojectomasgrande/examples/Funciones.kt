package com.example.miprojectomasgrande.examples

fun main() {

    imprimirNombre("alma")
    imprimirNombreCompleto(
        "alma",
        "marcela",
        "gozo"
    )
    imprimirNombreCompletoYEdad(
        "alma",
        "marcela",
        "gozo",
        15
    )
    imprimirNombres("alma", "marcela")
    dias("l")
    dias("m")
    dias("w")
    dias("j")
    dias("v")
    dias("s")
    dias("d")
    multiplicar(2)
    traducir("computer")
    traducir("mouse")
    traducir("rainbow")
    traducir("lollipops")


}

fun imprimirNombre(name: String) {
    println("El nombre es $name")

}

fun imprimirNombres(name: String, name2: String) {
    println("El nombre es $name y el segundo nombre es $name2")
}

fun imprimirNombreCompleto(name: String, name2: String, apeshidos: String) {
    println("Los nombres son $name $name2 y los apehidos son $apeshidos ")
}

fun imprimirNombreCompletoYEdad(name: String, name2: String, apeshidos: String, edad: Int) {
    println("Los nombres son $name $name2 y los apehidos son $apeshidos ademas tiene $edad años ")
}

fun dias(dias: String) {

    when (dias) {
        "l" -> {
            println("Luneh")
        }
        "m" -> {
            println("Marteh")
        }
        "w" -> {
            println("Miercoleh")
        }
        "j" -> {
            println("Jueveh")
        }
        "v" -> {
            println("Vierneh")
        }
        "s" -> {
            println("Sabadoh")
        }
        "d" -> {
            println("Domingoh")
        }
    }
}

fun multiplicar(numeros: Int) {
    for (i in 1..10) {
        println("$numeros x $i = ${numeros * i}")
    }
}

fun traducir(palabras: String) {
    when (palabras) {
        "computer" -> {
            println("pc")
        }
        "mouse" -> {
            println("mouse xd")
        }
        "rainbow" -> {
            println("arcoiris")

        }
        "lollipops" -> {
            println("paletas")
        }

    }


}