package CentroComputosV2;

public class Proceso {
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

}
