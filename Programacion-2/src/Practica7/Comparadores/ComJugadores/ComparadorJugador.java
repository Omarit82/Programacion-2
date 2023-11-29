package Practica7.Comparadores.ComJugadores;
import java.util.Comparator;

public abstract class ComparadorJugador implements Comparator<Jugador> {

    private ComparadorJugador siguiente;

    public ComparadorJugador(){
        this.siguiente = null;
    }
    public ComparadorJugador(ComparadorJugador siguiente){
        this.siguiente = siguiente;
    }

    public abstract int comparar(Jugador j1, Jugador j2);

    public int compare(Jugador j1, Jugador j2){
        int aux = this.comparar(j1, j2);
        if(aux == 0 ){
            if(siguiente != null){
                return siguiente.compare(j1, j2);
            } else {
                return 0;
            }
        }
        return aux;
    }
}
