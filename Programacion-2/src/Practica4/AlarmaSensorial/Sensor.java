package Practica4.AlarmaSensorial;

public class Sensor {
    private String nombreZona;
    private boolean estado; //false es activo - true es inactivo.

    public Sensor(String nombreZona){
        this.nombreZona = nombreZona;
        estado = false;
    }
    public String getNombreZona() {
        return nombreZona;
    }
    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
