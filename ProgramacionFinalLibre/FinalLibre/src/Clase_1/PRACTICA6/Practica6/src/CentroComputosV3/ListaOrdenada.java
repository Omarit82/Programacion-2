package CentroComputosV3;
import java.util.ArrayList;
public class ListaOrdenada {

    private ArrayList<ElementoOrdenado> items;

    public ListaOrdenada(){
        items = new ArrayList<>();
    }

    /* Metodo Template*/
    public void agregarItem(ElementoOrdenado it){
        boolean encontro = false;
        int i = 0;
        while (!encontro && items.size()>i){
            if(it.esMayor(items.get(i))){
                encontro = true;
                items.add(i,it);
            }
            i++;
        }

        if(!encontro){
            items.add(it);
        }
    }

    public String listar(){
        String auxiliar="";
        for (Object item : items) {
            auxiliar+=item;
        }
        return auxiliar;
    }
}
