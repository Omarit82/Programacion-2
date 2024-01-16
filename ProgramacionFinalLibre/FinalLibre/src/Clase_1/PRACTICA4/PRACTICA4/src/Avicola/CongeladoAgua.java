package Avicola;

import java.time.LocalDate;

public class CongeladoAgua extends Refrigerado{
    private int salinidad;


    public CongeladoAgua(LocalDate fechaVencimiento, int numeroLote, int codigoSupervision, int tempMantenimiento,String granjaOrigen, LocalDate fechaEnvasado,int salinidad) {
        super(fechaVencimiento, numeroLote, codigoSupervision, tempMantenimiento, granjaOrigen, fechaEnvasado);
        this.salinidad = salinidad;
    }

    public int getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(int salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString(){
        String aux = super.toString();
        return aux+"\n"+"SALINIDAD: "+getSalinidad()+" en gramos por litro de agua.";
    }
    
}
