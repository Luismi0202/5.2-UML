

fun main(){
    var cliente1 = Cliente("Luismi")
    println(cliente1.nombre)

    var producto1 = Producto("Patatas","Buenas patatas",4.0,1,9.0)
    println(producto1)

    var producto2 = Producto("Calabazas","Buenas calabazas",2.0,2,10.0)
    println(producto2)

    var pedido1= Pedidos(mutableMapOf(producto1 to 1,producto2 to 2),"30/01/2025")
    var pago1 = TarjetaCredito(3.0,"1234567891014124","02/02/2040","Visa")
    var pago2 = Cheque(3.0,"ChequeLuismi","BBVA")
    var pago3 = Cash(3.0,"€")
    var pago4= Cash(3.0,"€")

    cliente1.realizarPedido(pedido1)
    println(cliente1.listaPedidos)

    cliente1.pagarPedido(pedido1,pago1.cantidad)
    println(cliente1.listaPedidos)

    cliente1.pagarPedido(pedido1,pago2.cantidad)
    cliente1.pagarPedido(pedido1,pago3.cantidad)
    println(cliente1.listaPedidos)

    println(cliente1.listaPedidos)
    println(cliente1.pedidosPagados)

    cliente1.pagarPedido(pedido1,pago4.cantidad)
}