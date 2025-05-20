package Pertemuan1

fun main(){
    val greet = { name: String -> greeting(name) }
    greet("kotlin")
}

fun greet(name: String) {
    println("Hello $name!")
}