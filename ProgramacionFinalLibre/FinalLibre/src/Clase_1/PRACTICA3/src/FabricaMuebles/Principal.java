package FabricaMuebles;

/*2 Fábrica de muebles
Una fábrica de muebles desea organizar su manufactura de manera electrónica. La
fábrica solo produce sillas, mesas y bancos. De cada uno de los productos guarda su
peso, su costo de fabricación, el valor de venta, el tipo de madera y el color. La fábrica
también posee un stock de productos disponibles. Se debe poder calcular el costo de
todos los productos en stock, ya sea precio de fabricación o precio de venta. El precio
de Venta es el precio de costo más un 35%
Consejo: Analizar Clase Vs Instancia
Extra: ¿Qué sucede si se agrega un producto cuyo precio de venta es el 10% más del
costo de fabricación? */

public class Principal {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Silla", "Roble", "blanco", 5, 100);
        Producto prod2 = new Producto("Silla", "Eucalipto", "blanco", 2, 75);
        Fabrica fabrica = new Fabrica("El Portal");

        fabrica.addAlStock(prod1);
        fabrica.addAlStock(prod2);
        System.out.println(fabrica.costoTotalStock());
    }
}
