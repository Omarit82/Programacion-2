package Practica7.Steaming;

public class CriterioGenero extends Criterio {
    private String genero;

    public CriterioGenero(String genero){
        this.genero = genero;
    }

    public boolean cumple(Pelicula p){
        if(p.getGenero().equals(genero)){
            return true;
        }else{
            return false;
        }
    }
}
