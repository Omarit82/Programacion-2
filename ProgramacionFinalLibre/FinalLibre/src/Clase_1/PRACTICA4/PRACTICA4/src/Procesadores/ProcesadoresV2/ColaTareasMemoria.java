package Procesadores.ProcesadoresV2;

public class ColaTareasMemoria extends ColaTareas{
    
    @Override
    public boolean esMayor(Tarea t1,Tarea t2){
        return t1.getMemoria()>t2.getMemoria();
    }
}
