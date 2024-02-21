package Plataforma;

import java.util.ArrayList;
import Plataforma.Busqueda.*;

public class Plataforma {

    private ArrayList<Pelicula> peliculas;
    
    public Plataforma(){
        peliculas = new ArrayList<>();
    }
    /* Ademas de no haber sido agregada antes debe cumplir con lo requerido en tiempo de ejecucion. */
    public void addPelicula(Pelicula pelicula, Rentable rentable){
        if(!peliculas.contains(pelicula)&& rentable.cumple(pelicula)){
            peliculas.add(pelicula);
        }
    }
    public void addPelicula(Pelicula pelicula){
        if (!peliculas.contains(pelicula)){
            peliculas.add(pelicula);
        }
    }

    public ArrayList<Pelicula> busqueda(Filtro filtro){
        ArrayList<Pelicula> auxiliar = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if(filtro.cumple(pelicula)){
                auxiliar.add(pelicula);
            }
        }
        return auxiliar;
    }

    @Override
    public String toString(){
        return "Peliculas: \n"+peliculas;
    }
}
