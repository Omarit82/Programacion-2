package Autos.Comparadores;

import Autos.Auto;

public class ComparadorAnio extends Comparador {

    public ComparadorAnio(){}
    public ComparadorAnio(Comparador siguiente){
        super(siguiente);
    }

    @Override
    public int comparando(Auto a1, Auto a2){
        return a2.getAnio() - a1.getAnio();
    }
}
