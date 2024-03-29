package CentroComputosV2;
import java.util.ArrayList;

public class ListaOrdenadaProcesos {

    private ArrayList<Proceso> procesos;

    public ListaOrdenadaProcesos(){
        procesos = new ArrayList<>();
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

    public String listar(){
        String auxiliar="";
        for (Proceso proceso : procesos) {
            auxiliar+=proceso;
        }
        return auxiliar;
    }
}