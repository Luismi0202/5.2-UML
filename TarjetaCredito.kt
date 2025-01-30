import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.YearMonth


class TarjetaCredito(
    cantidad: Double,
    numero:String,
    fechaCaducidad:String,
    tipo:String):Pago(cantidad) {
        init{
            require(esTarjetaCreditoValida(numero)){"La tarjeta de credito no es correcta"}
            require(cantidad > 0){"La cantidad de pago no puede ser 0"}
            require(esFechaValida(fechaCaducidad) && esFechaCaducidadValida(fechaCaducidad)){"Su tarjeta ha expirado"}
        }

    private fun esTarjetaCreditoValida(numero: String): Boolean {
        return numero.length in 13..19 && numero.all { it.isDigit() }
    }


    private fun esFechaValida(fecha: String): Boolean {
        return try {
            val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            LocalDate.parse(fecha, formatter) // Intenta convertir la fecha
            true
        } catch (e: DateTimeParseException) {
            false
        }
    }

    private fun esFechaCaducidadValida(fechaCaducidad: String): Boolean {
        return try {
            val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            val caducidad = YearMonth.parse(fechaCaducidad, formatter)
            val ahora = YearMonth.from(LocalDate.now())

            caducidad.isAfter(ahora) // Comprueba si la fecha de caducidad es mayor a la actual
        } catch (e: Exception) {
            false // Si el formato es incorrecto, devuelve false
        }
    }
}