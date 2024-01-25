package Puerto;

import java.time.LocalDate;

public class Camion extends TransporteCarga{
    
    private LocalDate fechaCarga;

    public Camion(String matricula, int capacidad, LocalDate fechaCarga) {
        super(matricula, capacidad);
        this.fechaCarga = fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

}
