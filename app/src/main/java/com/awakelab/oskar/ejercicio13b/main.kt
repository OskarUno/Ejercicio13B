package com.awakelab.oskar.ejercicio13b

data class Heroe(
    val superHero: String,
    val publisher: String,
    val realName: String,
    val photo: String,

    )

fun main() {
    println("Ingrese super Heroes, para salir presione   ")
    var heroes = mutableListOf<Heroe>()
    var cant: Int = 1;
    while (cant == 1) {
        print("Nombre: ")
        var superHero = readln()

        print("publisher: ")
        var publisher = readln()

        print("realName: ")
        var realName = readln()

        print("photo: ")
        var photo = readln()
        heroes.add(Heroe(superHero, publisher, realName, photo))

        print("Para Salir Presiones 'S' o 's' ")
        val salirContuar = readln()
        if (salirContuar == "S" || salirContuar == "s") {
            cant = 0
        }
    }

    for (h in heroes) {
        println(h)
    }
}