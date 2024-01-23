package CentroComputos;
/*2. Centro de Cómputos
Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
computadoras que dispone. Si no hay computadoras disponibles los procesos a ejecutar deben
esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
lugar). Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
prioriza la selección de las computadoras más rápidas */
import java.util.ArrayList;

public class Centro {
    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> procesos;
    
    public Centro(){
        computadoras = new ArrayList<>();
        procesos = new ArrayList<>();
    }

    public void agregarCompu(Computadora c1){
        boolean encontro = false;
        int i = 0;
        while (!encontro && computadoras.size()>i){
            if(c1.getVelocidad()>computadoras.get(i).getVelocidad()){
                encontro = true;
                computadoras.add(i,c1);
            }
            i++;
        }

        if(!encontro){
            computadoras.add(c1);
        }
    }
    public void agregarProceso(Proceso p1){
        boolean encontro = false;
        int i = 0;
        while (!encontro && procesos.size()>i){
            if(p1.getMemoria()>procesos.get(i).getMemoria()){
                encontro = true;
                procesos.add(i,p1);
            }
            i++;
        }

        if(!encontro){
            procesos.add(p1);
        }
    }
}
