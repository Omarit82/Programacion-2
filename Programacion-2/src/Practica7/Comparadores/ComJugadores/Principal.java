package Practica7.Comparadores.ComJugadores;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Messi", 65, 1.58, 350, "izquierda");
        Jugador j2 = new Jugador("Maradorna", 72, 1.60, 150, "izquierda");
        Jugador j3 = new Jugador("Palermo",80,1.90,250,"derecha");
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);

        System.out.println(jugadores);
        
        ComparadorJugador com1 = new ComparadorNombre();
        ComparadorJugador com2 = new ComparadorGoles(com1);
        ComparadorJugador com3 = new ComparadorAltura(com2);
        ComparadorJugador com4 = new ComparadorPierna(com3);

        Collections.sort(jugadores,com4);
        System.out.println(jugadores);

    }
}
