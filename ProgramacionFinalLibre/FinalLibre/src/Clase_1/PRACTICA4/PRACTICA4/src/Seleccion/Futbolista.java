package Seleccion;

public class Futbolista extends Integrante {

    private String posicion;
    private String piernaHabil;
    private int qGoles;

    public Futbolista(String nombre, String apellido, int pasaporte, int anio, int mes, int dia,String posicion, String piernaHabil) {
        super(nombre, apellido, pasaporte, anio, mes, dia);
        this.qGoles = 0;
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    public int getqGoles() {
        return qGoles;
    }

    public void setqGoles(int qGoles) {
        this.qGoles = qGoles;
    }
}
