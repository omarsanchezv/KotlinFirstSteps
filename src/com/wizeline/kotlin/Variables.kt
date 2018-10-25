package com.wizeline.kotlin

class Variables {
    val inmutable : String= "Omar Sanchez"
    var mutable: String = "mutable"
    var optional : String? = "opcional"
    var numeroDeLetras : Int = 0

    constructor(){
        valVariable()
        varVariable(mutable)
        valOptinal()
        valNested()

    }
    fun valVariable() {
        println(inmutable)//imprime tu nombre
    }

    fun varVariable(text: String) {
        println(text)
    }

    fun valOptinal(){
        if(optional != null) {
            numeroDeLetras = optional?.length!!
            println(numeroDeLetras)
        }
    }

    fun valNested(){
        println("la parabra es $optional y tiene $numeroDeLetras letras")
    }


}

