package Clase_1.PRACTICA2.EstablecimientoDeportivo;

public class Cancha {
    
    private double precio;
    private String nombre;

    public Cancha(String nombre, double precio){
        this.precio = precio;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
