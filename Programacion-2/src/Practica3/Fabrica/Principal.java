package Practica3.Fabrica;

public class Principal {
    /*
     *  Una fábrica de muebles desea organizar su manufactura de manera electrónica. La
        fábrica solo produce sillas, mesas y bancos. De cada uno de los productos guarda su
        peso, su costo de fabricación, el valor de venta, el tipo de madera y el color. La fábrica
        también posee un stock de productos disponibles. Se debe poder calcular el costo de
        todos los productos en stock, ya sea precio de fabricación o precio de venta. El precio
        de Venta es el precio de costo más un 35% 
    */

    public static void main(String[] args) {
        Fabrica muebleria = new Fabrica();

        Silla silla = new Silla(2, 5, "Algarrobo" ,"marron");
        Silla silla2 = new Silla(2, 6, "Algarrobo" ,"marron");

        muebleria.addProducto(silla2);
        muebleria.addProducto(silla);
        System.out.println(muebleria.valorStock());
        
    }
    


}
