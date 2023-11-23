package Practica4.Seleccion;

public class Entrenador extends Integrante{
    public String federacion;

    public Entrenador(String nombre, String apellido, long pasaporte, int year, int month, int day,String federacion) {
        super(nombre, apellido, pasaporte, year, month, day);
        this.federacion = federacion;
    }

    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
    
    
    
}
