package Practica7.Documentos;

public class CriterioFrase extends Criterio {

    private String frase;

    public CriterioFrase(String frase){
        this.frase = frase;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getContenido().contains(frase);
    }  
    
}
