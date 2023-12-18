package Practica7.Steaming;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private String genero;
    private String director;
    private ArrayList<String>actores;
    private int anio;
    private int duracion;
    private int edadMinima;
    
    public Pelicula(String titulo, String sinopsis, String genero, String director, int anio, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        actores = new ArrayList<String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    /*Permite agreagar un actor */
    public void addActor(String actor){
        actores.add(actor);
    }
    /*Consulta si un actor participa de la pelicula. */
    public boolean participaActor(String actor){
        if(actores.contains(actor)){
            return true;
        }else{
            return false;
        }
    }
}
