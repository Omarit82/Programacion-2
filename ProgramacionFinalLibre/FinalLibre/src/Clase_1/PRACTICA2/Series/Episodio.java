package Clase_1.PRACTICA2.Series;

public class Episodio {

    /* Atributos */

    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;
    private int temporada; //Resulvo la temporada asignandole un atributo a cada capitulo.(Temporada a la que pertenece)
    public static final int MINIMO = 1;
    public static final int MAXIMO = 5;

    /* Constructor */
   
    public Episodio(String titulo, String descripcion, int temporada){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.temporada = temporada;
        flag = false;
        calificacion = -1;
    }

    /* Getters & Setters */
    
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
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        if(isFlag()){
            if((calificacion > MINIMO)&& (calificacion < MAXIMO) ){
                this.calificacion = calificacion;
            }else{
                System.out.println("La calificacion ingresada es incorrecta.");
            }
        }
    }
    public int getTemporada() {
        return temporada;
    }
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
