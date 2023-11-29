package Practica7.Comparadores.ComJugadores;

public class ComparadorPierna extends ComparadorJugador {
    private ComparadorJugador siguiente;

    public ComparadorPierna(){
        this.siguiente = null;
    }

    public ComparadorPierna(ComparadorJugador siguiente){
        super(siguiente);
    }
    
    public int comparar(Jugador j1, Jugador j2){
        return j1.getPiernaHabil().compareTo(j2.getPiernaHabil());
    }
    public ComparadorJugador getComparadorJugador(){
        return siguiente;
    }
}
