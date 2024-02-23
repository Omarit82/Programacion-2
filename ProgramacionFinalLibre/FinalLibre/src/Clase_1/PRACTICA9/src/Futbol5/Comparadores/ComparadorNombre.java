package Futbol5.Comparadores;

import Futbol5.Socio;

public class ComparadorNombre extends Comparador {
    @Override
    public int compare(Socio socio1, Socio socio2){
        return socio1.getNombre().compareTo(socio2.getNombre());
    }

}
