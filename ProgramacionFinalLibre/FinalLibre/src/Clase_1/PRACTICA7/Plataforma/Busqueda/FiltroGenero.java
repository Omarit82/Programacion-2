package Plataforma.Busqueda;

import Plataforma.Pelicula;

public class FiltroGenero extends Filtro{

    private String genero;

    public FiltroGenero(String genero){
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        if(pelicula.tieneGenero(genero)){
            return true;
        }else{
            return false;
        }
    }
    
}
