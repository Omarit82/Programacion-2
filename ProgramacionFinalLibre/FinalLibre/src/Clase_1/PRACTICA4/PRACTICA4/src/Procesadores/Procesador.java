package Procesadores;
import java.util.ArrayList;

public abstract class Procesador {
    private ArrayList<Tarea> tareas;

    public Procesador(){
        tareas = new ArrayList<>();
    }
    public abstract boolean esMayor(Tarea t1,Tarea t2);

    public void addTarea(Tarea t1){
        /*Tengo que agregar las tareas al arraylist pero ordenadas */
        int i =0;
        boolean encontro = false;

        while((i<tareas.size())&&(!encontro)){
            if(this.esMayor(t1,tareas.get(i))){
                encontro= true;
                tareas.add(i, t1);
            }
            i++;
        }
        if(!encontro){
            tareas.add(t1);
        }        
    }

    public void ejecutarPrimera(){
        if(tareas.size()>0){
            Tarea tt = tareas.get(0);
            tareas.remove(0);
            tt.ejecutarTarea();
        }
    }

    public String toString(){
        return tareas.toString();
    }

}
