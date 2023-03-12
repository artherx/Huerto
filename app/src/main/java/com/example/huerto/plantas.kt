package com.example.huerto

open class Plantas(val tamaño: Float, val tipoHoja: String? = null, val tipoFruto: String? = null, val epocaFloración: String, val colorFlor: String? = null, val tipoSuelo: String, val necesidadesLuz: Float, val climaAdecuado: String, val humedad: Float, val necesidadesEspacio: Float, var cuidadosEspecíficos: String, var solucion: String) {
    // ...
}
class Frutales(tamaño: Float, tipoFruto: String, tipoSuelo: String, necesidadesLuz: Float, climaAdecuado: String, humedad: Float, necesidadesEspacio: Float, cuidadosEspecíficos: String, solucion: String, epocaFloración: String) : Plantas(tamaño, tipoFruto = tipoFruto, tipoSuelo = tipoSuelo, necesidadesLuz = necesidadesLuz, climaAdecuado = climaAdecuado, humedad = humedad, necesidadesEspacio = necesidadesEspacio, cuidadosEspecíficos = cuidadosEspecíficos, solucion = solucion, epocaFloración = epocaFloración) {
    // ...
}