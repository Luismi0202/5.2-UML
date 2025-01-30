class Cliente(
    var nombre:String
) {
    var listaPedidos:MutableList<Pedidos> = mutableListOf()
    var pedidosPagados: MutableList<Pedidos> = mutableListOf()

    fun realizarPedido(pedido:Pedidos){
        for(producto in pedido.productos.keys){
            var cantidadPedida = pedido.productos[producto]
            var cantidadTotal = producto.stock

            if(cantidadPedida == null){
                cantidadPedida = 0
            }

            if(cantidadPedida > cantidadTotal){
                var cantidadAnadida = cantidadPedida-cantidadTotal
                println("Para el producto $producto solo se han añadido $cantidadAnadida por falta de stock")
                pedido.productos[producto] = cantidadAnadida
            }
        }
        listaPedidos.add(pedido)
    }

    fun pagarPedido(pedido:Pedidos,cantidad:Double){
        if(pedido !in listaPedidos){
            println("Su pedido no se ha realizado en ningún momento, escriba uno ya existente")
        }
        else{
            pedido.realizarPago(cantidad)
            if (pedido.estado.toString() != "pdte"){
                listaPedidos.remove(pedido)
                pedidosPagados.add(pedido)
            }
        }
    }
}