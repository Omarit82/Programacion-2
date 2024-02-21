package Plataforma.Busqueda;

import Plataforma.Pelicula;

public abstract class Filtro {
    
    public abstract boolean cumple(Pelicula pelicula);
}
