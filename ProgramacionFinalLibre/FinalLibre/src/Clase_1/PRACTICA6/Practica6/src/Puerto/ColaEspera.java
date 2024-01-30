package Puerto;
import java.util.ArrayList;

public class ColaEspera {
    
    private ArrayList<Transporte> transportes;
    
    public ColaEspera(){
        transportes = new ArrayList<>();
    }

    /*Esta cola de espera va a utilizar el metodo de Transporte esMayor para ordenar */

    public void agregarTransporte(Transporte tt){
        boolean encontro = false;
        int i=0;
        while (!encontro && i<transportes.size()) {
            if(tt.esMayor(transportes.get(i))){
                transportes.add(i, tt);
                encontro =true;
            }            
            i++;
        }

        if(!encontro){
            transportes.add(tt);
        }
    }

    /*Tamaño de la cola de espera */
    public int getSize(){
        return transportes.size();
    }

    public Transporte get(int index){
        if(index< transportes.size()){
            return transportes.get(index);
        }else{
            return null;
        }
         
    }
}
