class Cash(
    cantidad:Double,
    var tipoMoneda:String
    ):Pago(cantidad) {
    init{
        require(tipoMoneda in listaMonedas){"La moneda no es permitida, puedes pagar en euros,dirhams o dolares"}
        require(cantidad >0){"¡La cantidad no puede ser 0!"}
    }
    companion object{
        val listaMonedas = listOf("€","$","د.إ ")
    }
}