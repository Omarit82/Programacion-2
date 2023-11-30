package Practica7.Documentos;

public class CriterioNoContiene extends Criterio {
    private String palabra;

    public CriterioNoContiene(String palabra){
        this.palabra = palabra;
    }

    public boolean cumple(Documento doc){
        if(!doc.findKeyword(palabra)){
            return true;
        }else{
            return false;
        }

    }
}
