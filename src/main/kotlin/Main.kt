package org.example

val nombreSistema: String = "GameZone"
val capacidad: Int = 10
var recaudacionTotal: Double = 0.0

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("GameZone iniciado.")
    println("Sistema: $nombreSistema")
    println("Capacidad: $capacidad")
    println("Recaudaciad: $recaudacionTotal")

    recaudacionTotal = 800.0
    println("Nuevo recaudaciado: $recaudacionTotal")
}