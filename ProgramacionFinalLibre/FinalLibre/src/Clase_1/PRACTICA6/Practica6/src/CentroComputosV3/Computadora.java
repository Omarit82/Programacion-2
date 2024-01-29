package CentroComputosV3;

public class Computadora extends ElementoOrdenado{
    /*Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
prioriza la selección de las computadoras más rápidas */ 
    private int id;
    private static int contador=1;
    private double velocidad;
    private Proceso p1;

    public Computadora(double velocidad){
        this.velocidad = velocidad;
        id = contador;
        contador++;
        p1 = null;
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

    public void ejecutarProceso(Proceso p1){
        this.p1 = p1;
    }

    @Override
    public boolean esMayor(ElementoOrdenado elemento){
        return this.getVelocidad()>((Computadora) elemento).getVelocidad();
    }
    
}
