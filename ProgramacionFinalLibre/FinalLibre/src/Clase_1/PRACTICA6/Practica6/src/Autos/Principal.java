package Autos;

import Autos.Comparadores.Comparador;
import Autos.Comparadores.ComparadorAnio;
import Autos.Comparadores.ComparadorKm;
import Autos.Criterios.Criterio;
import Autos.Criterios.CriterioColor;

public class Principal {
    public static void main(String[] args) {
        Auto a1 = new Auto("Peugeot", "307", 150000, 2006, "gris");
        Auto a2 = new Auto("peugeot", "307", 155000, 2006, "Gris");
        Auto a3 = new Auto("peugeot", "307", 150000, 2007, "Negro");
        Auto a4 = new Auto("Peugeot", "307", 155000, 2005, "gris");
        Auto a5 = new Auto("peugeot", "307", 125000, 2006, "Gris");
        Auto a6 = new Auto("peugeot", "307", 175000, 2004, "Negro");

        Concesionaria leffort = new Concesionaria("L'Effort");

        leffort.addAuto(a1);
        leffort.addAuto(a2);
        leffort.addAuto(a3);
        leffort.addAuto(a4);
        leffort.addAuto(a5);
        leffort.addAuto(a6);
        
        Comparador com1 = new ComparadorKm();
        Comparador com2 = new ComparadorAnio(com1);

        System.out.println(leffort.comparadores(com2));


        System.out.println();
        Criterio criterio2 = new CriterioColor("Negro");
        System.out.println(leffort.busqueda(criterio2));
        
    }
}
