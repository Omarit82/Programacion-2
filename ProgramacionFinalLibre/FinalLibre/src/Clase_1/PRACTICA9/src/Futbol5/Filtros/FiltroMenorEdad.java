package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroMenorEdad extends Filtro{
    private int edad;
    public FiltroMenorEdad(int edad){
        this.edad = edad;
    }

    public boolean cumple(Socio socio){
        return socio.getEdad()<edad;
    } 
    
}
