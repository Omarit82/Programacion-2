package Historiador.Criterios;

import Historiador.Documento;
public class CriterioAutor extends Criterio{
    private String autor;
    
    public CriterioAutor(String autor){
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento doc){
        if(doc.tieneAutor(autor)){
            return true;
        }else{
            return false;
        }
    }
}
