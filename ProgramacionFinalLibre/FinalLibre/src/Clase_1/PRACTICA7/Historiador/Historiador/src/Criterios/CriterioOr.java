package Historiador.src.Criterios;

import Historiador.src.Documento;
public class CriterioOr extends Criterio{
    
    private Criterio crit1;
    private Criterio crit2;

    public CriterioOr(Criterio cr1, Criterio cr2){
        this.crit1 = cr1;
        this.crit2 = cr2;
    }

    @Override
    public boolean cumple(Documento doc){
        if(crit1.cumple(doc) || crit2.cumple(doc)){
            return true;
        }else{
            return false;
        }
    }
}
