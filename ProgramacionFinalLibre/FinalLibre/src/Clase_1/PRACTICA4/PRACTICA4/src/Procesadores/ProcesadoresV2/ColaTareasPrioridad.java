package Procesadores.ProcesadoresV2;

public class ColaTareasPrioridad extends ColaTareas {
    
    @Override
    public boolean esMayor(Tarea t1,Tarea t2){
        return t1.getPrioridad()>t2.getPrioridad();
    }
}
