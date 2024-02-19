package Vivero;

public class CritSolSuperior extends Criterio{

    private int valor;

    public CritSolSuperior(int valor){
        this.valor = valor;
    }

    @Override
    public boolean cumple(Planta planta){
        if(planta.getRequerimientoSol()>valor){
            return true;
        }else{
            return false;
        }
    }
    
}
