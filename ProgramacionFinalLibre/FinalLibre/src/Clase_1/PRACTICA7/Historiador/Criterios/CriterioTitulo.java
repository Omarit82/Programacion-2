package Historiador.Criterios;

import Historiador.Documento;
public class CriterioTitulo extends Criterio{

    private String titulo;

    public CriterioTitulo(String titulo){
        this.titulo = titulo;
    }
    
    @Override
    public boolean cumple(Documento doc){
        if(this.titulo.equals(doc.getTitulo())){
            return true;
        }else{
            return false;
        }
    }
    
}
