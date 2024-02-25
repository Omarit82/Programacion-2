package TPEspecial;

import java.util.ArrayList;

public class Jugador {
    private String nombreJugador;
    private ArrayList<Carta> mazoJugador;

    public Jugador(String nombreJugador){
        this.nombreJugador = nombreJugador;
        mazoJugador = new ArrayList<>();
    }

    public String getNombreJugador() {
        return nombreJugador;
    }
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getCantidadCartas(){
        return mazoJugador.size();
    }

    public void addCartaMazoJugador(Carta carta){
        mazoJugador.add(carta);
    }

    public Carta jugarCarta(){
        /*--Chequeo arreglo vacio--*/
        if(!mazoJugador.isEmpty()){
            return mazoJugador.remove(0);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Jugador [nombreJugador=" + nombreJugador + ", mazoJugador=" + mazoJugador + "]";
    }

    
}
