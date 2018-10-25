package com.wizeline.kotlin

class ControlFlow {
    constructor(){
        println("Entre a = 5 y b = 8 ${ifMayor(5,8)} es mayor")
        println("Entre a = 5 y b = 8 ${ifMenor(5,8)} es menor")
        println("las letras pares de la palabra FIMAZ son ${cicloFor("FIMAZ")} y tiene los indices ${cicloForIndice("FIMAZ")}")
    }

    fun ifMayor() : Int{
        if(a>b){}
    }

    fun ifMenor() : Int{
        if(a<b){}
    }

    fun cicloFor(mesage : String) {
        for (caracter in mesage){
            println(caracter)
        }
    }

    fun cicloForIndice(mesage: String){
        for ((indice,caracter) in mesage){
            println("$indice , $caracter")
        }
    }


}