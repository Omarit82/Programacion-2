package CentroComputosV3;

public class Proceso implements ElementoOrdenado{
    private int id;
    private static int contador=1;
    private double memoria;

    public Proceso(double memoria){
        this.memoria = memoria;
        id = contador;
        contador++;
    }

    public int getId() {
        return id;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }
    public String toString(){
        return "Proceso: "+id+"| "+" Memoria: "+getMemoria()+"\n";
    }

    @Override
    public boolean esMayor(ElementoOrdenado elemento){
        return this.getMemoria()>((Proceso) elemento).getMemoria();
    }
}
