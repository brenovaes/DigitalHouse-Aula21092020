package br.com.digitalhouse.exercicio1

fun main() {
    val arrayList = arrayListOf<String> ()
    arrayList.addAll(listOf("Pato", "Cachorro", "Gato"))
    println(arrayList.get(3))

    try {
        println("Terceiro elemento: ${arrayList[3]}")
    } catch (ex: Exception) {
        println("Ocorreu uma exceção: ${ex.message}")
        ex.stackTrace
    }
}