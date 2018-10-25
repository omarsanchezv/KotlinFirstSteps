package com.wizeline.kotlin

class Variables {
    val inmutable = null
    var mutable: String = null
    var optional : String? = null

    fun valVariable() {
        println(inmutable)//imprime tu nombre
    }

    fun varVariable(text: String) {
        println(text)
    }

    fun valOptinal(){
        println(optional.length)
    }

    fun valNested(){
        println("la parabra es optional y tiene numeroDeLetras ")
    }


}

