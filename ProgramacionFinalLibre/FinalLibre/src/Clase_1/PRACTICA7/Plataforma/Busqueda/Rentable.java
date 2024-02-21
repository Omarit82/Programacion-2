package Plataforma.Busqueda;
import Plataforma.Pelicula;
public class Rentable extends Filtro{

    private Filtro filtro;
    
    public Rentable(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return (filtro.cumple(pelicula));
    }
}
