package Plataforma.Busqueda;

import Plataforma.Pelicula;

public class FiltroTitulo extends Filtro{

    private String palabra;

    public FiltroTitulo(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.getTitulo().contains(palabra);
    }
    
}
