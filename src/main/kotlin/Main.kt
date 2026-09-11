package org.example

import Consola

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

val tipoUsuario = "socio"

val monto = 10000.0
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

    println(aplicarBeneficioUsuario(monto, "infantil"))
    println(aplicarBeneficioUsuario(monto, "socio"))
    println(aplicarBeneficioUsuario(monto, "educacional"))

    if (tipoUsuario == "socio"){
        println("Tiene beneficio de socio")
    }else{
        println("No tienes beneficio de socio")
    }

    println(consola.codigo)
    println(consola.marca)
    println(consola.modelo)
    println(consola.tipoUsuario)
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

fun describirTipoUsuario(tipoUsuario: String): String{
    return when (tipoUsuario){
        "infantil" -> "Usuario infantil"
        "socio" -> "Usuario socio"
        "educacional" -> "Usuario educacional"
        else -> "Usuario invalido"
    }
}

fun aplicarBeneficioUsuario(monto: Double, tipoUsuario: String): Double {
    return when (tipoUsuario){
        "socio" -> monto * 0.80
        "educaional" -> monto * 0.50
        "infantil" -> monto
        else -> monto
    }
}

val consola = Consola(
    codigo = "CC12CD",
    marca = "Sony",
    modelo = "PlayStation 5",
    tipoUsuario = "socio",
)



