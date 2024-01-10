package Procesadores;

public class Tarea {
    private int prioridad;
    private int memoria;
    private int cpu;
    private String id;

    public Tarea(int prioridad,int memoria,int cpu, String id){
        this.prioridad = prioridad;
        this.memoria = memoria;
        this.cpu = cpu;
        this.id = id;
    }

    public void ejecutarTarea(){
        System.out.println("Tarea ejecutada!");
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String toString(){
        return "Tarea=> "+id+", Memoria: "+memoria+",Prioridad: "+prioridad+", CPU: "+cpu+"\n";
    }
}
