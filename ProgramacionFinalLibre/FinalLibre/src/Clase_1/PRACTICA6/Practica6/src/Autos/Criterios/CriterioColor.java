package Autos.Criterios;

import Autos.Auto;

public class CriterioColor extends Criterio{

    private String color;

    public CriterioColor(String color){
        this.color = color.toLowerCase();
    }

    @Override
    public boolean cumple(Auto auto){
        return auto.getColor().equals(color);
    }
    
}
