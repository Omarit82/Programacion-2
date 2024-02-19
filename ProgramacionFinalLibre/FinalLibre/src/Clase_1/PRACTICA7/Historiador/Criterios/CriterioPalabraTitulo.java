package Historiador.Criterios;

import Historiador.Documento;
public class CriterioPalabraTitulo extends Criterio{

    private String palabra;

    public CriterioPalabraTitulo(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento doc){
        if(doc.getTitulo().contains(palabra)){
            return true;
        }else{
            return false;
        }
    }
    
}
