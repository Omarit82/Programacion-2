package Avicola;

import java.time.LocalDate;

public class Refrigerado extends Producto{
    private int codigoSupervision;
    private int tempMantenimiento;
    private String granjaOrigen;
    private LocalDate fechaEnvasado;

    public Refrigerado(LocalDate fechaVencimiento, int numeroLote,int codigoSupervision, int tempMantenimiento, String granjaOrigen, LocalDate fechaEnvasado) {
        super(fechaVencimiento, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.tempMantenimiento=tempMantenimiento;
        this.granjaOrigen = granjaOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }
    public int getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(int codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public int getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(int tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    
    @Override
    public String toString(){
        String aux =super.toString();
        return aux+"\n"+
            "CODIGO DE SUPERVISION: "+getCodigoSupervision()+"\n"+
            "TEMPERATURA DE MANTENIMIENTO: "+getTempMantenimiento()+"\n"+
            "GRANJA DE ORIGEN: "+getGranjaOrigen()+"\n"+
            "FECHA DE ENVASADO: "+getFechaEnvasado();
    }
    
}
