package ProcesadoresV1;
import java.util.ArrayList;
public abstract class Procesador {
    private ArrayList<Tarea> tareas;
    
    public Procesador(){
        tareas = new ArrayList<>();
    }
    public abstract boolean esMayor(Tarea t1, Tarea t2);
    /* agregar tarea */
    public void agregarTarea(Tarea t1){
        boolean encontro = false;
        int i=0;
        while(!encontro && tareas.size()<i){
            if(esMayor(t1, tareas.get(i))){
                encontro =true;
                tareas.add(i, t1);
            }
            i++;
        }
        if(!encontro){
            tareas.add(t1);
        }
    }

    /* ejecuta una tarea */
    public void ejecutarPrimera(){
        if(tareas.size()>0){
            Tarea aux = tareas.get(0);
            tareas.remove(0);
            aux.ejecutarTarea();
        }
    }

    @Override
    public String toString(){
        String auxiliar = "";
        for (Tarea tarea : tareas) {
            auxiliar += tarea+"\n";
        }
        return auxiliar;
    }
}
