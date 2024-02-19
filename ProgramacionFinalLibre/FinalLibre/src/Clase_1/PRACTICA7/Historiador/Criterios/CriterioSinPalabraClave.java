package Historiador.Criterios;

import Historiador.Documento;
public class CriterioSinPalabraClave extends Criterio{

    public CriterioSinPalabraClave(){}
    @Override
    public boolean cumple(Documento doc){
        if(doc.tienePalabrasClave()){
            return false;
        }else{
            return true;
        }
    }
    
}
