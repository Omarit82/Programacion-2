package CandyCrush.Filtros;
import CandyCrush.*;
public class FichasOr extends Filtro{

    private Filtro uno;
    private Filtro dos;

    public FichasOr(Filtro uno, Filtro dos){
        this.uno=uno;
        this.dos=dos;
    }

    @Override
    public boolean cumple(Ficha ficha){
        if(uno.cumple(ficha) || dos.cumple(ficha)){
            return true;
        }else{
            return false;
        }
    }
    
}
