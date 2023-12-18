package Practica7.Steaming;

public class CriterioPalabraTitulo extends Criterio {
    private String palabra;

    public CriterioPalabraTitulo(String palabra){
        this.palabra = palabra;
    }

    public boolean cumple(Pelicula p){
        if(p.getTitulo().contains(palabra)){
            return true;
        }else{
            return false;
        }
    }
    
}
