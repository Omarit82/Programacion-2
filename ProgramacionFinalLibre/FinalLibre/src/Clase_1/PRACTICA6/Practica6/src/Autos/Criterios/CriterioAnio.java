package Autos.Criterios;

import Autos.Auto;

public class CriterioAnio extends Criterio{

    private int anio;

    public CriterioAnio(int anio){
        this.anio = anio;
    }
    @Override
    public boolean cumple(Auto auto){
        return auto.getAnio() == anio;
    }
    
}
