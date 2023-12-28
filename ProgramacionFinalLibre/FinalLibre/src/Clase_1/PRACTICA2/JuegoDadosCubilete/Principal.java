package Clase_1.PRACTICA2.JuegoDadosCubilete;

public class Principal {
    public static void main(String[] args) {
        Cubilete cub = new Cubilete(5, 6);
        Jugador j1 = new Jugador("Omar");
        Jugador j2 = new Jugador("Malena");

        Juego juego = new Juego(j1, j2, cub,10);
        juego.jugar();
        if(juego.ganador() != null){
            System.out.println("Gano: "+juego.ganador().getNombre()+" con: "+juego.ganador().getPuntaje()+" puntos!");
        }else{
            System.out.println("Empate!");
        }
        
    }
}
