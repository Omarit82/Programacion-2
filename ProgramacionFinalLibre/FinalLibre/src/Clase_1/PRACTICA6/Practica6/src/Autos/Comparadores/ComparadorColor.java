package Autos.Comparadores;

import Autos.Auto;

public class ComparadorColor extends Comparador {
    
    public ComparadorColor(){}
    public ComparadorColor(Comparador siguiente){
        super(siguiente);
    }

    @Override
    public int comparando(Auto a1, Auto a2){
        return a1.getColor().compareTo(a2.getColor());
    }
}
