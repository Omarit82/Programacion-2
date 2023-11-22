package Practica2.Series;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flagVisto;
    private int calificacion;

    public Episodio(String titulo,String descripcion,boolean flagVisto, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flagVisto = flagVisto;
        setCalificacion(calificacion);
    }

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

    public boolean isFlagVisto() {
        return flagVisto;
    }

    public void setFlagVisto(boolean flagVisto) {
        this.flagVisto = flagVisto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if(flagVisto == false){
            this.calificacion = -1;
        } else if ((calificacion>0) && (calificacion<6)){
            this.calificacion = calificacion;
        } else {
            System.out.println("Valor de calificacion incorrecto.");
        }
    }    
}
