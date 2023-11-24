package Practica6.CentroComputos;

public class Computadora extends ElementoCola{

    private static int id=10;
    private int idComputadora;
    private int memoria;

    public Computadora(int memoria){
        this.memoria=memoria;
        idComputadora = id;
        id++;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public boolean esMayor(ElementoCola com){
        Computadora compu = (Computadora) com;
        return compu.getMemoria() < this.getMemoria();
    }

    
    
}
