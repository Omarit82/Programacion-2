package Historiador.Criterios;

import Historiador.Documento;

public class CriterioNot extends Criterio{

    private Criterio crit;

    public CriterioNot(Criterio crit){
        this.crit = crit;
    }

    @Override
    public boolean cumple(Documento doc){
        return !crit.cumple(doc);
    }
    
}
