package Procesadores.ProcesadoresV2;

public class Principal {
    /* Debe organizar tareas por CPU, memoria o procesador. */
    public static void main(String[] args) {
        Procesador p1 = new Procesador();
        Tarea t1 = new Tarea(15, 2, 25, "T1");
        Tarea t2 = new Tarea(8, 25, 75, "T2");
        Tarea t3 = new Tarea(2, 125, 10, "T3");
        Tarea t4 = new Tarea(4, 30, 100, "T4");
        Tarea t5 = new Tarea(20, 8, 50, "T5");
        p1.agregarTarea(t1);
        p1.agregarTarea(t2);
        p1.agregarTarea(t3);
        p1.agregarTarea(t4);
        p1.agregarTarea(t5);
        System.out.println(p1);
        ColaTareas c2 = new ColaTareasMemoria();
        p1.setOrdenamiento(c2);
        System.out.println(p1);
        ColaTareas c3 = new ColaTareasPrioridad();
        p1.setOrdenamiento(c3);
        System.out.println(p1);
    }        
}
