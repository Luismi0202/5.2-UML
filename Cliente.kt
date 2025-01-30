class Cliente(
    var nombre:String
) {
    var listaPedidos:MutableList<Pedidos> = mutableListOf()
    var pedidosPagados: MutableList<Pedidos> = mutableListOf()

    fun realizarPedido(pedido:Pedidos){
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