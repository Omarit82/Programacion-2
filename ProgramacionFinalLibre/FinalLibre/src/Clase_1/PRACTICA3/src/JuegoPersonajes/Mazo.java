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

    public void dealMazo(Jugador player1,Jugador player2){

        int cantidadCartas = this.cantidadCartas();
        if(cantidadCartas%2 == 0){
            /*Cantidad de cartas par */
            for (int i=0;i<(cantidadCartas-1);i++){
                player1.addCarta(selectCarta(i));
                player2.addCarta(selectCarta(i+1));
                i++;
            }
        }else{
            /*Cantidad de cartas impar */
             for (int i=0;i<(cantidadCartas-2);i++){
                player1.addCarta(selectCarta(i));
                player2.addCarta(selectCarta(i+1));
                i++;
            }
        }
    }
}
