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
        capitulos = new ArrayList<Episodio>();
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

    public String episodiosVistosPorTemporada(int temporada){
        int contador = 0;
        for (Episodio episodio : capitulos) {
            if((episodio.getTemporada() == temporada)&&(episodio.isFlag())){
                contador++;
            }
        }
        return "Se vieron: "+contador+" episodios de la temporada: "+temporada;
    }
    public String episodiosVistosSerie(){
        int contador = 0;
        for (Episodio episodio : capitulos) {
            if(episodio.isFlag()){
                contador++;
            }
        }
        return "Se vieron: "+contador+" episodios de la serie.";
    }

    public String promedioTemporada(int temporada){
        int contador = 0;
        double promedio = 0;
        for (Episodio episodio : capitulos) {
            if((episodio.getTemporada()==temporada)&&(episodio.isFlag())){
                contador++;
                promedio += episodio.getCalificacion();
            }
        }
        double resultado = promedio / contador;
        return "El promedio de la temporada: "+temporada+" es: "+resultado;
    }

    public String promedioSerie(){
        int contador = 0;
        double promedio = 0;
        for (Episodio episodio : capitulos) {
            if(episodio.isFlag()){
                contador++;
                promedio += episodio.getCalificacion();
            }
        }
        return "El promedio de la Serie es: "+(promedio/contador);    
    }

    public String serieVista(){
        int i = 0;
        int corte=0;
        while((corte==0)&&(capitulos.size()<i)){
            if(capitulos.get(i).isFlag()){
                i++;
            }else{
                corte = 1;
            }
        }
        if(corte == 0){
            return "Se vieron todos los capitulos de la serie";
        }else{
            return "No se vieron todos los capitulos de la serie.";
        }
    }
}
