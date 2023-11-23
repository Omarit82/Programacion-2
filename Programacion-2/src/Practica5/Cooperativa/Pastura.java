package Practica5.Cooperativa;

public class Pastura extends Cereal{
    private int superficeRequerida;

    public Pastura(String nombre, int superficeRequerida) {
        super(nombre);
        this.superficeRequerida = superficeRequerida;
    }

    public boolean checkRequerimiento(Lote l){
        if(super.checkRequerimiento(l)&& l.getSuperficie()> superficeRequerida){
            return true;
        }else{
            return false;
        }
    }

    public int getSuperficeRequerida() {
        return superficeRequerida;
    }

    public void setSuperficeRequerida(int superficeRequerida) {
        this.superficeRequerida = superficeRequerida;
    }

    
    
}
