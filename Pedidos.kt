import kotlin.math.round

class Pedidos(
    var productos: Map<Producto,Int>,
    var fecha:String,
    var estado:Estado = Estado.PDTE,
) {
    var coste = round(calcularCoste())

    init{
        idPedido++
    }
    private fun calcularCoste():Double{
        var coste = 0.0
        for(producto in productos.keys){
            var cantidad: Int? = 0
            var precioProducto = producto.precio
            cantidad = productos[producto]
            if(cantidad == null){
                cantidad = 0
            }
            coste+= (precioProducto*cantidad)
        }
        return coste
    }

    fun realizarPago(cantidad:Double):Boolean{
        var pagado = false

        if(estado.toString() != "pdte"){
            println("Su pedido ya ha sido pagado!!!")
            return false
        }

        if(cantidad > 0 && cantidad <= coste){
            coste = coste-cantidad
            println("Pago realizado correctamente")
        }

        if(coste == 0.0){
            println("¡El artículo ha sido pagado al completo!")
            Estado.PGDO
        }
        else if (cantidad > coste && cantidad <=0){
            println("Error, debe ingresar una cantidad menor a la total a pagar y mayor a 0")
        }
        return pagado
    }

    companion object{
        var idPedido = 0
    }
    override fun toString(): String {
        return "Pedido $idPedido, estado:$estado PRECIO: $coste"
    }
}