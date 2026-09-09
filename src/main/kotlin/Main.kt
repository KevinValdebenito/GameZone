package org.example

val nombreSistema: String = "GameZone"
val capacidad: Int = 10
var recaudacionTotal: Double = 0.0


val minutoUso: Int = 75
val tarifaHora: Double = 800.0

val costoBase = calcularCostoBase(
    minutoUso,
    tarifaHora
)

val totalConIva = aplicarIva(costoBase)

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("GameZone iniciado.")
    println("Sistema: $nombreSistema")
    println("Capacidad: $capacidad")
    println("Recaudaciad: $recaudacionTotal")


    recaudacionTotal = 800.0
    println("Nuevo recaudaciado: $recaudacionTotal")

    println("Conto Base: $costoBase")
    println("Total Con Iva: $totalConIva")
}

fun calcularCostoBase(
    minutos: Int,
    tarifaHora: Double
): Double {
    return (minutos / 60.0)*tarifaHora
}

fun aplicarIva(monto: Double): Double {
    return monto * 1.19
}