package Practica4.Seleccion;

public class Masajista extends Integrante {
    private String titulo;
    private int experiencia;

    public Masajista(String nombre, String apellido, long pasaporte, int year, int month, int day, String titulo,int experiencia) {
        super(nombre, apellido, pasaporte, year, month, day);
        this.titulo = titulo;
        this.experiencia = experiencia;
    }
    public void addExperiencia(){
        experiencia++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    
    
    
}
