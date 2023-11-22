package Practica4.AlarmaSensorial;

public class Luz {
    private boolean encendida;

    public Luz(){
        encendida = false;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void encender(){
        System.out.println("Luz encendida!");
        encendida =true;
    }
}
