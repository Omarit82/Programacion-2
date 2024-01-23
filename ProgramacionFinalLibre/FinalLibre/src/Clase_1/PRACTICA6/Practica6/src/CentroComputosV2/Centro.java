package CentroComputosV2;
/*2. Centro de Cómputos
Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
computadoras que dispone. Si no hay computadoras disponibles los procesos a ejecutar deben
esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
lugar). Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
prioriza la selección de las computadoras más rápidas */

public class Centro {
    /*El centro debe tener una lista ordenada. */
    private ListaOrdenadaCompu computadoras;
    private ListaOrdenadaProcesos procesos;
    
    public Centro(){
        computadoras = new ListaOrdenadaCompu();
        procesos = new ListaOrdenadaProcesos();
    }

    public void agregarCompu(Computadora c1){
        computadoras.agregarCompu(c1);
    }

    public void agregarProceso(Proceso p1){
       procesos.agregarProceso(p1);
    }
}
