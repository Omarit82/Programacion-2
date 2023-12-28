package Clase_1.PRACTICA2.JuegoDadosMesa;

public class Principal {
    public static void main(String[] args) {
        Cubilete cub = new Cubilete(2, 6);
        Jugador j1 = new Jugador("Omar");
        Jugador j2 = new Jugador("Malena");
        Jugador j3 = new Jugador("Roberto");

        MesaJuego mesa = new MesaJuego(3);
        mesa.addPlayer(j1, 0);
        mesa.addPlayer(j2, 1);
        mesa.addPlayer(j3, 2);

        Juego juego = new Juego(mesa, cub, 5, 11);


        Jugador winner = juego.jugar();
        
        if(winner != null){
            System.out.println("Gano: "+winner.getNombre()+" con: "+winner.getPuntaje()+" puntos!");
        }else{
            System.out.println("Empate!");
        }
        
    }
}
