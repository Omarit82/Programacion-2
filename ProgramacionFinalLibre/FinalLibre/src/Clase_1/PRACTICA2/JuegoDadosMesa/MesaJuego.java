package Clase_1.PRACTICA2.JuegoDadosMesa;

public class MesaJuego {
    
    /*Atributos de la Mesa de juego. */
    private Jugador[] jugadores;
    private int cantidadJugadores;
    
    /*Constructor */
    public MesaJuego(int cantidadJugadores){
        this.cantidadJugadores = cantidadJugadores;
        jugadores = new Jugador[cantidadJugadores];
    }

    /*Metodos */

    public int getCantidadJugadores(){
        return cantidadJugadores;
    }

    public void addPlayer(Jugador jj, int pos){
        jugadores[pos] = jj;
    }

    public Jugador seleccionarJugador(int pos){
        return jugadores[pos];
    }

    public void reemplazarJugador(Jugador player,int pos){
        if((player != null) && (pos>=0)&&(pos<jugadores.length)){
            jugadores[pos]=player;
            System.out.println("Jugador: "+player.getNombre()+" sentado en posicion: "+(pos+1)+" de la mesa");
        }
    }
}
