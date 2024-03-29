package Vivero.Criterios;

import Vivero.Planta;

public class CriterioAnd extends Criterio{

    private Criterio crit1;
    private Criterio crit2;

    public CriterioAnd(Criterio crit1, Criterio crit2){
        this.crit1 = crit1;
        this.crit2 = crit2;
    }

    @Override
    public boolean cumple(Planta planta){
        return (crit1.cumple(planta) && crit2.cumple(planta));
    }
    
}
