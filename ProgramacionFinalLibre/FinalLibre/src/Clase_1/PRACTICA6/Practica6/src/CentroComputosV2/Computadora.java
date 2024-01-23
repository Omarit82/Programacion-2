package CentroComputosV2;

public class Computadora {
    /*Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
prioriza la selección de las computadoras más rápidas */ 
    private int id;
    private static int contador=1;
    private double velocidad;

    public Computadora(double velocidad){
        this.velocidad = velocidad;
        id = contador;
        contador++;
    }

    public int getId() {
        return id;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String toString(){
        return "Computadora: "+id+"| Velocidad: "+getVelocidad()+"\n";
    }
    
}
