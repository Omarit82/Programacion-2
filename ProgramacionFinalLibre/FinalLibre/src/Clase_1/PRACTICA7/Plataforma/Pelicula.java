package Plataforma;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anioEstreno;
    private int duracion;
    private int edadMinimaRequerida;

    public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracion,
            int edadMinimaRequerida) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMinimaRequerida = edadMinimaRequerida;
        generos = new ArrayList<>();
        actores = new ArrayList<>();
    }

    public void addGenero(String genero){
        if(!generos.contains(genero)){
            generos.add(genero);
        }
    }

    public void addActor(String actor){
        if(!actores.contains(actor)){
            actores.add(actor);
        }
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinimaRequerida() {
        return edadMinimaRequerida;
    }

    public void setEdadMinimaRequerida(int edadMinimaRequerida) {
        this.edadMinimaRequerida = edadMinimaRequerida;
    }

    public boolean tieneGenero(String genero){
        if(generos.contains(genero)){
            return true;
        }else{
            return false;
        }
    }

    public boolean tieneActor(String actor){
        if(actores.contains(actor)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object objeto){
        try {
            Pelicula peli = (Pelicula) objeto;
            if(peli.getTitulo().equals(this.getTitulo())&&peli.getDirector().equals(this.getDirector())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n Sinopsis: " + sinopsis + "\n Generos: " + generos + "\n Director: "
                + director + "\n Actores: " + actores + "\n Estreno: " + anioEstreno + "\n Duracion: " + duracion
                + "\n Rated: " + edadMinimaRequerida + "\n";
    }

    
}
