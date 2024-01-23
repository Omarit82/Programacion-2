package ProcesadoresV1;

public class Tarea {

    private int id;
    private static int contador=1;
    private String nombre;
    private int prioridad;
    private double memoria;
    private double cpu;
    

    public Tarea(int prioridad,double memoria,double cpu){
        this.prioridad = prioridad;
        this.memoria = memoria;
        this.cpu = cpu;
        id = contador;
        contador++;
        nombre = "Tarea Numero: "+id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public String ejecutarTarea(){
        return nombre+" ejecutada!";
    }

    @Override
    public String toString(){
        return getNombre()+" | "+getPrioridad()+" | "+getMemoria()+" | "+getCpu();
    }
    
}
