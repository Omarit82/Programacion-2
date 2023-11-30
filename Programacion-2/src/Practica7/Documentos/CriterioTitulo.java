package Practica7.Documentos;

public class CriterioTitulo extends Criterio  {

    private String titulo;

    public CriterioTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().equals(titulo);
    }
    
}
