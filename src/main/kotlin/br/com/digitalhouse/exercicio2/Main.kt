package br.com.digitalhouse.exercicio2

fun main() {
    val arrayList: MutableList<String>? = null
    arrayList?.addAll(listOf("Pato", "Cachorro", "Gato"))
    println(arrayList?.get(2))

    try {
        println(arrayList?.get(2))
    } catch (ex: Exception) {
        println("Ocorreu uma exceção: ${ex.message}")
        ex.stackTrace
    }

    val arrayList2 = mutableListOf<String>()
    //println(arrayList2.get(5))

    try {
        println(arrayList2.get(5))
    } catch (ex: Exception) {
        println("Ocorreu uma exceção: ${ex.message}")
        ex.stackTrace
    }
}