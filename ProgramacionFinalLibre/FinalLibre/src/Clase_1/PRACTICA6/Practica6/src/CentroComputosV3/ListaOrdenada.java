package CentroComputosV3;
import java.util.ArrayList;
public abstract class ListaOrdenada {
    private ArrayList<Object> items;

    public ListaOrdenada(){
        items = new ArrayList<>();
    }

    public abstract boolean esMayor(Object it1, Object it2);

    /* Metodo Template*/
    public void agregarItem(Object it){
        boolean encontro = false;
        int i = 0;
        while (!encontro && items.size()>i){
            if(esMayor(it, items.get(i))){
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
