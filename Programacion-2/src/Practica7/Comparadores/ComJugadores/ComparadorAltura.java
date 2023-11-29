package Practica7.Comparadores.ComJugadores;

public class ComparadorAltura extends ComparadorJugador {

    private ComparadorJugador siguiente;

    public ComparadorAltura(){
        this.siguiente = null;
    }

    public ComparadorAltura(ComparadorJugador siguiente){
        super(siguiente);
    }
    
    public int comparar(Jugador j1, Jugador j2){
        return (int) (j1.getAltura()-j2.getAltura());
    }
}
