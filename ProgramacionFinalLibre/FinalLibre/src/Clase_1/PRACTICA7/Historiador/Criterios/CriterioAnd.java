package Historiador.Criterios;

import Historiador.Documento;
public class CriterioAnd extends Criterio{
    
    private Criterio crit1;
    private Criterio crit2;

    public CriterioAnd(Criterio crit1, Criterio crit2){
        this.crit1=crit1;
        this.crit2=crit2;
    }
    @Override
    public boolean cumple(Documento doc){
        if(crit1.cumple(doc) && crit2.cumple(doc)){
            return true;
        }else{
            return false;
        }
    }
}
