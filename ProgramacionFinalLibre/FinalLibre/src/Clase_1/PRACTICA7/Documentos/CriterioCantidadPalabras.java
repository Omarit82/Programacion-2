

public class CriterioCantidadPalabras extends Criterio{
    
    private int numero;

    public CriterioCantidadPalabras(int numero){
        this.numero = numero;
    }

    @Override
    public boolean cumple(Documento doc){
        if(doc.cantidadPalabras()>numero){
            return true;
        }else{
            return false;
        }
    }
}
