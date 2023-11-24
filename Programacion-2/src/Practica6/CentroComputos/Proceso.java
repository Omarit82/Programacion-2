package Practica6.CentroComputos;

public class Proceso extends ElementoCola{
    private static int id=1;
    private int memoriaRequerida;
    private int idProceso;

    public Proceso (int memoriaRequerida){
        this.memoriaRequerida = memoriaRequerida;
        idProceso = id;
        id++;
    }

    public int getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public void setMemoriaRequerida(int memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public boolean esMayor(ElementoCola e){
        Proceso a = (Proceso) e;
        return a.getMemoriaRequerida() < this.getMemoriaRequerida();
    }
    
}
