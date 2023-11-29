package Practica7.Comparadores.ComJugadores;

public class Jugador {
    private String nombre;
    private double peso;
    private double altura;
    private int goles;
    private String piernaHabil;

    public Jugador(String nombre, double peso, double altura, int goles, String piernaHabil) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.goles = goles;
        this.piernaHabil = piernaHabil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }
    
    public String toString(){
        return "Nombre: "+getNombre()+" | Altura: "+getAltura()+" | Peso: "+getPeso()+" | Goles: "+getGoles()+" | Pierna habil: "+ getPiernaHabil()+"\n"; 
    }
    
}
