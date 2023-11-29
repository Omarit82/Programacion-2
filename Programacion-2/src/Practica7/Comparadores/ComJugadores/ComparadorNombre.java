package Practica7.Comparadores.ComJugadores;

public class ComparadorNombre extends ComparadorJugador {
    private ComparadorJugador siguiente;

    public ComparadorNombre(){
        this.siguiente = null;
    }

    public ComparadorNombre(ComparadorJugador siguiente){
        super(siguiente);
    }

    public int comparar(Jugador j1, Jugador j2){
        return j1.getNombre().compareTo(j2.getNombre());
    }
    
}
