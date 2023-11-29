package Practica7.Comparadores.ComJugadores;

public class ComparadorGoles extends ComparadorJugador{
    private ComparadorJugador siguiente;

    public ComparadorGoles(){
        this.siguiente = null;
    }

    public ComparadorGoles(ComparadorJugador siguiente){
        super(siguiente);
    }
    
    public int comparar(Jugador j1, Jugador j2){
        return  (j1.getGoles()-j2.getGoles());
    }
    
}
