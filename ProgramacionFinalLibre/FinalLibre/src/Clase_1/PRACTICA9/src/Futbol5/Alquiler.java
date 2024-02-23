package Futbol5;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private int idCancha;
    private double precio;
    
    public Alquiler(LocalDate fecha, int idCancha, double precio) {
        this.fecha = fecha;
        this.idCancha = idCancha;
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
}
