package Practica3.JuegoPersonajes;

public class Personaje {
    /*
    *  Cada personaje del
       juego posee un nombre real, un nombre de super héroe y un conjunto de cualidades o
       características, que son visión nocturna, velocidad, fuerza peso, altura y edad.
    */

    private String nombreReal;
    private String nombreSuper;
    private double visionNocturna;
    private double velocidad;
    private double fuerza;
    private double peso;
    private int edad;

    public Personaje(String nombreReal, String nombreSuper, double visionNocturna, double velocidad, double fuerza,
            double peso, int edad) {
        this.nombreReal = nombreReal;
        this.nombreSuper = nombreSuper;
        this.visionNocturna = visionNocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombreReal() {
        return nombreReal;
    }
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }
    public String getNombreSuper() {
        return nombreSuper;
    }
    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }
    public double getVisionNocturna() {
        return visionNocturna;
    }
    public void setVisionNocturna(double visionNocturna) {
        this.visionNocturna = visionNocturna;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public double getFuerza() {
        return fuerza;
    }
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
