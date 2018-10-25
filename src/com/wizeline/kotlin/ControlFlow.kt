package com.wizeline.kotlin

class ControlFlow {
    ///NO SE PUEDE IMPRIMIR ASI POR QUE PRIMERO EJECUTA LO INTERNO
    constructor() {
        println("Entre a = 5 y b = 8 ${ifMayor(5, 8)} es mayor")
        println("Entre a = 5 y b = 8 ${ifMenor(5, 8)} es menor")
        println("las letras pares de la palabra FIMAZ son ${cicloFor("FIMAZ")} y tiene los indices ${cicloForIndice("FIMAZ")}")
    }

    fun ifMayor(a: Int, b: Int): Int {
        if (a > b) {
            return a
        }else{
            return b
        }
    }

    fun ifMenor(a: Int , b: Int): Int {
        return if (a < b) a else b
    }

    fun cicloFor(mesage: String) {
        for (caracter in mesage) {
            println(caracter)
        }
    }

    fun cicloForIndice(mesage: String) {
        for ((indice, caracter) in mesage.withIndex()) {
            println("$indice , $caracter")
        }
    }



}