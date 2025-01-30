class Producto(
    var nombre:String,
    var descripcion:String,
    var precioSinImpuestos:Double,
    var stock: Int,
    var impuestos:Double
) {
    var precio = calcularPrecioTotal()

    fun comprobarStock():Boolean{
        if(stock <=0){
            return false
        }
        else return true
    }

    fun calcularImpuestos(): Double {
        return precioSinImpuestos * (impuestos / 100)
    }

    fun calcularPrecioTotal(): Double {
        return precioSinImpuestos + calcularImpuestos()
    }

    override fun toString(): String {
        return "Nombre: $nombre Precio: $precioSinImpuestos Stock: $stock Impuestos: $impuestos TOTAL: $precio"
    }
}