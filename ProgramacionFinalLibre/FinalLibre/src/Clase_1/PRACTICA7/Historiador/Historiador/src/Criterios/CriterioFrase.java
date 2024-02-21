package Historiador.src.Criterios;

import Historiador.src.Documento;
public class CriterioFrase extends Criterio{

    private String frase;

    public CriterioFrase(String frase){
        this.frase = frase;
    }

    @Override
    public boolean cumple(Documento doc){
        if(doc.getContenidoTextual().contains(frase)){
            return true;
        }else{
            return false;
        }
    }
    
}
