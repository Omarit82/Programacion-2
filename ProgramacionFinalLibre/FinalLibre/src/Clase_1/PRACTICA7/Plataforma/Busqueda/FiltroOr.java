package Plataforma.Busqueda;
import Plataforma.Pelicula;
public class FiltroOr extends Filtro{
    
    private Filtro ff1;
    private Filtro ff2;

    public FiltroOr(Filtro ff1, Filtro ff2){
        this.ff1 = ff1;
        this.ff2 = ff2;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return (ff1.cumple(pelicula)||ff2.cumple(pelicula));
    }
    
}
