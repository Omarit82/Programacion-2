package Alquiler;

import java.time.LocalDate;

public class Vehiculo extends ItemAlquiler{
    private String tipo;
    private String marca;
    private int kilometros;
    private String patente;
    
    public Vehiculo(LocalDate fechaDevolucion, String tipo, String marca, int kilometros, String patente) {
        super(fechaDevolucion);
        this.tipo = tipo;
        this.marca = marca;
        this.kilometros = kilometros;
        this.patente = patente;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getKilometros() {
        return kilometros;
    }
    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    

}
