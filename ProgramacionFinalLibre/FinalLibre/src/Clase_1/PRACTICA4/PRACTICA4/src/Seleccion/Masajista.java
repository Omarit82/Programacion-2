package Seleccion;

public class Masajista extends Integrante{

    private String titulo;
    private int aniosExperiencia;

    public Masajista(String nombre, String apellido, int pasaporte, int anio, int mes, int dia,String titulo,int aniosExperiencia) {
        super(nombre, apellido, pasaporte, anio, mes, dia);
        this.titulo = titulo;     
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    
    
}
