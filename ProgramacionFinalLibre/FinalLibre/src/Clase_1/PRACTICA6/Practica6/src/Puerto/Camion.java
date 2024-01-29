package Puerto;

import java.time.LocalDate;

public class Camion extends Transporte{
    
    private LocalDate fechaCarga;
    private double capacidad;
    private String matricula;

    public Camion(String matricula, double capacidad, LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
        this.matricula = matricula;
        this.capacidad = capacidad;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
