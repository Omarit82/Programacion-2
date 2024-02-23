package Futbol5.Comparadores;

import Futbol5.Socio;

public class ComparadorCompuesto extends Comparador{
    private Comparador comp1;
    private Comparador comp2;

    public ComparadorCompuesto(Comparador comp1, Comparador comp2){
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Socio o1, Socio o2){
        int resultado = comp1.compare(o1, o2);
        if(resultado == 0){
            return comp2.compare(o1, o2);
        }

        return resultado;
    }
}
