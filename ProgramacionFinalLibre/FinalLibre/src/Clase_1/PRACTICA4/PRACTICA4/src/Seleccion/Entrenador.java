package Seleccion;

public class Entrenador extends Integrante{

    private String identificador;

    public Entrenador(String nombre, String apellido, int pasaporte, int anio, int mes, int dia,String identificador) {
        super(nombre, apellido, pasaporte, anio, mes, dia);
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    
    
}
