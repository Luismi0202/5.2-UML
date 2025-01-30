class Cheque(
    cantidad:Double,
    var nombre:String,
    var banco:String
):Pago(cantidad){
    init{
        require(cantidad >0){"La cantidad de pago no puede ser 0"}
    }
}