package CentroComputosV2;
import java.util.ArrayList;

public class ListaOrdenadaCompu {

    private ArrayList<Computadora> computadoras;

    public ListaOrdenadaCompu(){
        computadoras = new ArrayList<>();
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

    public String listar(){
        String auxiliar ="";
        for (Computadora computadora : computadoras) {
            auxiliar += computadora;
        }
        return auxiliar;
    }
}
