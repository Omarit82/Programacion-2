package Clase_1.PRACTICA2.Series;
import java.util.ArrayList;

public class Serie {
    
    /* Atributos */
    private ArrayList<Episodio> capitulos;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    /* Constructor */

    public Serie(String titulo,String descripcion,String creador,String genero){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        capitulos = new ArrayList<>();
    }
    
    /*  Getters & Setters */
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /* Funcionalidades */

    public void addCapitulo(Episodio capitulo){
        capitulos.add(capitulo);
    }

    public int episodiosVistos(int temporada){
        int contador = 0;
        for (Episodio episodio : capitulos) {
            if((episodio.getTemporada() == temporada)&&(episodio.isFlag())){
                contador++;
            }
        }
        return contador;
    }

}
