package Practica7.Documentos;

public class CriterioKeyword extends Criterio {
    private String palabra;

    public CriterioKeyword(String palabra){
        this.palabra = palabra;
    }
    public boolean cumple(Documento d){
        if(d.findKeyword(palabra)){
            return true;
        } else {
            return false; 
        }
    }
}
