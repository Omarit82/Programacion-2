package Plataforma.Busqueda;

import Plataforma.Pelicula;

public class FiltroNot extends Filtro{

    private Filtro ff;

    public FiltroNot(Filtro ff){
        this.ff = ff;
    }

    @Override
    public boolean cumple(Pelicula peli){
        return !ff.cumple(peli);
    }
    
}
