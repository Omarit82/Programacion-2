package Avicola;

import java.time.LocalDate;

public class CongeladoNitrogeno extends Refrigerado{
    private int tiempoExposicion;
    private String metodoEmpleado;

    public CongeladoNitrogeno(LocalDate fechaVencimiento, int numeroLote, int codigoSupervision, int tempMantenimiento,
            String granjaOrigen, LocalDate fechaEnvasado, int tiempoExposicion) {
        super(fechaVencimiento, numeroLote, codigoSupervision, tempMantenimiento, granjaOrigen, fechaEnvasado);
        this.tiempoExposicion = tiempoExposicion;
        metodoEmpleado =  "Refrigerado por Nitrogeno";
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoEmpleado() {
        return metodoEmpleado;
    }

    public void setMetodoEmpleado(String metodoEmpleado) {
        this.metodoEmpleado = metodoEmpleado;
    }   
    
}
