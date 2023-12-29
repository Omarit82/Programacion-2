package Clase_1.PRACTICA2.JuegoDadosTrampa;

public class Principal {
    public static void main(String[] args) {
        Cubilete cub = new Cubilete(2, 6);
        Jugador j1 = new Jugador("Omar");
        Jugador j2 = new JugadorTramposo("Malena");

        Juego juego = new Juego(j1, j2, cub,20,8);


        juego.jugar();
        if(juego.ganador() != null){
            System.out.println("Gano: "+juego.ganador().getNombre()+" con: "+juego.ganador().getPuntaje()+" puntos!");
        }else{
            System.out.println("Empate!");
        }
        
    }
}
