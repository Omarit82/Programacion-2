package Plataforma.Busqueda;

import Plataforma.Pelicula;

public class FiltroDirector extends Filtro{
    private String director;

    public FiltroDirector(String director){
        this.director = director;
    }

    @Override
    public boolean cumple (Pelicula peli){
        if(peli.getDirector().equals(director)){
            return true;
        }else{
            return false;
        }
    }
    
}
