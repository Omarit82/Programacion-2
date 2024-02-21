package Plataforma.Busqueda;

import Plataforma.Pelicula;

public class FiltroPreviasAnio extends Filtro{

    private int anio;

    public FiltroPreviasAnio (int anio){
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pelicula peli){
        return peli.getAnioEstreno()<anio;
    }

}
