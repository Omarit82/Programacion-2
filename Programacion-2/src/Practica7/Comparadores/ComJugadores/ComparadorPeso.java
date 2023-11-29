package Practica7.Comparadores.ComJugadores;

public class ComparadorPeso extends ComparadorJugador{
    private ComparadorJugador siguiente;

    public ComparadorPeso(){
        this.siguiente = null;
    }

    public ComparadorPeso(ComparadorJugador siguiente){
        super(siguiente);
    }
    
    public int comparar(Jugador j1, Jugador j2){
        return (int) (j1.getPeso()-j2.getPeso());
    }
    
}
