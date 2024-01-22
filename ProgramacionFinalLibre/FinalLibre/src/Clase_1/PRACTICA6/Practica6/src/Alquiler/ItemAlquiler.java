package Alquiler;

import java.time.LocalDate;

public class ItemAlquiler {
    private LocalDate fechaDevolucion;

    public ItemAlquiler(LocalDate fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
}
