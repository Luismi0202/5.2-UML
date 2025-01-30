# 5.2-UML

Trabajo a realizar:

Para diseñar un sistema que gestione los pedidos de mi empresa, es necesario considerar los siguientes requerimientos:

Los pedidos los realizan los clientes, y pueden contener uno o varios productos.
Debe registrar la información de cada pedido, incluyendo la fecha en que se realizó.
Estos productos deben estar registrados en el sistema junto con su información correspondiente (nombre, descripción, precio, impuestos, etc.).
El sistema debe ser capaz de calcular el coste total de cada pedido, teniendo en cuenta la cantidad de cada producto incluido en el pedido, sus precios individuales y los impuestos correspondientes.
Debe haber un registro actualizado del stock de cada producto, de forma que se pueda informar al cliente si habrá algún retraso en la entrega debido a falta de stock.
Cada pedido puede ser pagado de una sola vez o en varios pagos. 
Se debe ser capaz de registrar la información de cada pago realizado por el cliente.
Las formas de pago aceptadas por el sistema son: Card (número, fecha de caducidad y tipo de tarjeta), Cash  (Tipo de moneda) y cheque (nombre y banco).
Cada pedido puede estar en uno de los siguientes estados: pdte, pgdo, pcdo, envdo, entgdo. El estado de cada pedido debe ser actualizado en el sistema en función de su evolución.

# ENLACE AL DIAGRAMA (NO CABE LA IMAGEN EN EL README)
-->
https://drive.google.com/file/d/1YbMJNZ0jiwnx6zuBQHdYg9RxCJE0j1Jk/view?usp=sharing

A parte, realiza:

# EJERCICIOS RESPUESTAS

**a) Una breve lista de los conceptos que te has encontrado en los diagramas UML que se asemejan a los conceptos de programación orientada a objetos. Por ejemplo: Clases: GestorPedidos**

-Uso de clases (que son las plantillas con las cuales se crean un objeto). He usado clases como cliente, pago, producto pedidos…

-Uso de métodos, que son las acciones que pueden hacer estas clases. Por ejemplo, el cliente puede realizar un pedido o un pago seleccionando el pedido. Los pedido calculan su coste y realizan su pago. 

-Uso de atributos dentro de las clases, estas son las propiedades que tienen. Por ejemplo, en clientes tenemos su nombre, en pago la cantidad que paga, en el producto su nombre, si hay stock, su descripción, el precio…

-Uso de clases numeradas para que las cosas sean de una forma. Esto se ha usado en los estados de los pedidos para que puedas seleccionar solo pagado, procesado,pendiente de pago y enviado. 

-Herencia para que en el pago hayan diferentes tipos de pago pero siempre van a heredar la propiedad cantidad, que es el número de dinero que se va a pagar.

**b) Explicación de la herramienta que has utilizado parra generar el diagrama UML, y si la has contrastado con otra y conclusiones de porque has elegido esa.**

He utilizado LucidChart, la descubrí gracias a youtube en un tutorial de UML y la verdad es que me ayudó muchísimo, tengo el enlace en mis apuntes. Creo que es una buena herramienta que contiene todo un paquete con los dibujos necesarios para poder montar tu esquema.

**c) Una explicación sobre la conversión del diagrama UML al código.**
TENIA UNAS IMÁGENES COMPARATIVAS QUE NO PUEDO PASAR POR EL README ASÍ QUE DEJO UN ENLACE AL ARCHIVO EN DRIVE-->
https://docs.google.com/document/d/1e1o86RpxkxBGtGYjuGJVGuG5L13N2BrhIFXAmdtSomE/edit?usp=sharing
