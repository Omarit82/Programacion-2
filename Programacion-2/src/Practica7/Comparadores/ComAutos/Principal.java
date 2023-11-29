package Practica7.Comparadores.ComAutos;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Ka", 2007, "Ford", "Rojo");
        Auto auto2 = new Auto("Ka", 2005, "Ford", "Blanco");
        Auto auto3 = new Auto("Ka", 2005, "Ford", "Rojo");
        Auto auto4 = new Auto("Focus", 2007, "Ford", "Rojo");   
        Auto auto5 = new Auto("Focus", 2005, "Ford", "Rojo");
        Auto auto6 = new Auto("Focus", 2005, "Ford", "Blanco");
        Auto auto7 = new Auto("206", 2012, "Peugeot", "Gris");
        Auto auto8 = new Auto("206", 2010, "Peugeot", "Gris");
        Auto auto9 = new Auto("206", 2012, "Peugeot", "Rojo");

        ArrayList<Auto> autos = new ArrayList<Auto>();

        autos.add(auto9);
        autos.add(auto8);
        autos.add(auto7);
        autos.add(auto6);
        autos.add(auto5);
        autos.add(auto4);
        autos.add(auto3);
        autos.add(auto2);
        autos.add(auto1);

        System.out.println(autos);

        ComparadorColor color = new ComparadorColor();
        ComparadorModelo modelo = new ComparadorModelo(color);
        ComparadorMarca marca = new ComparadorMarca(modelo);
        ComparadorNombre nombre = new ComparadorNombre(marca);

        Collections.sort(autos,nombre);

        System.out.println(autos);
    }
    
}
