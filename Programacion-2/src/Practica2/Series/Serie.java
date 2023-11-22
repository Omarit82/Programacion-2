package Practica2.Series;
import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String creador;
    private String descripcion;
    private String genero;
    private ArrayList<Temporada>temporadas; 

    public Serie(String titulo, String creador, String descripcion,String genero){
        this.titulo=titulo;
        this.creador=creador;
        this.descripcion=descripcion;
        this.genero=genero;
        temporadas=new ArrayList<Temporada>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void addTemporada(Temporada t){
        temporadas.add(t);
    }

    public int episodiosVistos(){
        int total = 0;
        for (Temporada temporada : temporadas) {
            total = total + temporada.episodiosVistos();
        }
        return total;
    }

    public double getPromedio(){
        int total = 0;
        for (Temporada temporada : temporadas) {
            total += temporada.getPromedio();
        }
        return (double) total/temporadas.size();
    }

    public boolean todosVistos(){
        boolean variable = false;
        int totalEpisodios = 0;
        for (Temporada temporada : temporadas) {
            totalEpisodios += temporada.cantidadEpisodios();
        }
        if ((episodiosVistos())==(totalEpisodios)){
            variable = true;
        }
        return variable;
    } 
}
