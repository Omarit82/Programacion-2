package Clase_1.PRACTICA2.JuegoDados;

public class PrincipalJuego {

    public static void main(String[] args) {
        Jugador j1 = new Jugador("Omar");
        Jugador j2 = new Jugador("Malena");

        Dado d1 = new Dado(6);
        Dado d2 = new Dado(6);


        Juego juego = new Juego(10, 7, j1,j2,d1,d2);

        Jugador ganador = juego.jugar();

        if(ganador != null){
            System.out.println("Ganó: "+ganador.getNombre()+" con: "+ganador.getPuntos()+" puntos");
        }else{
            System.out.println("Empate!");
        }
    }
    
}
