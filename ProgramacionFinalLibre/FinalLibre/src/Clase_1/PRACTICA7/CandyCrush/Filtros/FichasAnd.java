package CandyCrush.Filtros;
import CandyCrush.*;
public class FichasAnd extends Filtro{

    private Filtro filtroUno;
    private Filtro filtroDos;

    public FichasAnd(Filtro filtroUno, Filtro filtroDos){
        this.filtroUno = filtroUno;
        this.filtroDos = filtroDos;
    }

    @Override

    public boolean cumple(Ficha ficha){
        if(filtroUno.cumple(ficha)&&filtroDos.cumple(ficha)){
            return true;
        }else{
            return false;
        }
    }
    
}
