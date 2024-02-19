package Vivero.Criterios;

import Vivero.Planta;

public class CriterioNot extends Criterio{

    private Criterio criterio;

    public CriterioNot(Criterio criterio){
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Planta planta){
        return !criterio.cumple(planta);
    }
    
}
