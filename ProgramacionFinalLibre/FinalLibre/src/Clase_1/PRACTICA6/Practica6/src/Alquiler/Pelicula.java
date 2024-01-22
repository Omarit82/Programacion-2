package Alquiler;

import java.time.LocalDate;

public class Pelicula extends ItemAlquiler {
    
    private String info;

    public Pelicula(String info, LocalDate fechaDevolucion){
        super(fechaDevolucion);
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
}
