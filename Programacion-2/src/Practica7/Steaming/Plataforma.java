package Practica7.Steaming;
import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;
    
    public Plataforma(){
        peliculas = new ArrayList<Pelicula>();
    }

    public void addPelicula(Pelicula p){
        peliculas.add(p);
    }

    /*Filtrado */
    public ArrayList<Pelicula> buscar (Criterio criterio){
        ArrayList<Pelicula> auxiliar = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if(criterio.cumple(pelicula)){
                auxiliar.add(pelicula);
            }
        }
        return auxiliar;
    }
}
