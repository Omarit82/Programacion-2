package Procesadores.ProcesadoresV2;

public class Procesador {

    /* El procesador va a tener metodos para  agregar tareas a la cola */
    private ColaTareas tareas;

    public Procesador(){
        tareas = new ColaTareasCPU();
    }

    public void agregarTarea (Tarea t1){
        tareas.agregarTarea(t1);
    }

    public void ejecutarPrimera(){
        Tarea t1 = tareas.obtenerPrimera();
        if(t1!=null){
            t1.ejecutarTarea();
        }
    }

    
    /*Le indico al procesador que tipo de cola de tarea voy a usar para ordenar */
    public void setOrdenamiento(ColaTareas nueva){
        while(tareas.getSize()>0){
            nueva.agregarTarea(tareas.obtenerPrimera());
        }
        tareas = nueva;
    }

    public String toString(){
        return tareas.toString();
    }
}
