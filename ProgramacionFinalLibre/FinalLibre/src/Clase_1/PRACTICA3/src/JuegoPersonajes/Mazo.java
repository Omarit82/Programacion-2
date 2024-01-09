package JuegoPersonajes;
import java.util.ArrayList;
public class Mazo {
    private ArrayList<Personaje> mazo;

    public Mazo (){
        mazo = new ArrayList<Personaje>();
    }

    public void addCarta(Personaje pp){
        if(pp !=null){
            mazo.add(pp);
        }
    }

    public int cantidadCartas(){
        return mazo.size();
    }

    public Personaje selectCarta(int index){
        return mazo.get(index);
    }

}
