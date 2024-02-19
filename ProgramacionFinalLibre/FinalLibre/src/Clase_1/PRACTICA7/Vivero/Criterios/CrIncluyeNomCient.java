package Vivero.Criterios;

import Vivero.Planta;

public class CrIncluyeNomCient extends Criterio{

    private String nombre;

    public CrIncluyeNomCient(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Planta planta){
        if(planta.getNombreCientifico().contains(nombre)){
            return true;
        }else{
            return false;
        }
    }
    
}
