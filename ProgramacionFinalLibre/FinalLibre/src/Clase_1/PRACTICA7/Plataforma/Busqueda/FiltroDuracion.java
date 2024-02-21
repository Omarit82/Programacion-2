package Plataforma.Busqueda;

import Plataforma.Pelicula;

public class FiltroDuracion extends Filtro{
    private int duracion;

    public FiltroDuracion(int duracion){
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.getDuracion()<duracion;
    }
    
}
