package JuegoPersonajes;

public class Juego {
    private Jugador player1;
    private Jugador player2;
    private Mazo mazo;
    private int contador=2;

    public Juego(Jugador p1,Jugador p2,Mazo mazo){
        player1 = p1;
        player2 = p2;
        this.mazo = mazo;
    }

    public void mano(){
        if(contador%2 == 0){
            Personaje jugado = player1.jugarCarta();
            System.out.println(jugado.getNombreSuper());
            int atributo = player1.seleccionarAtributo();
            System.out.println(player1.mostrarAtributo(atributo, jugado));

            Personaje jugado2 = player2.jugarCarta();
            System.out.println(jugado2.getNombreSuper());
            System.out.println(player2.mostrarAtributo(atributo, jugado2));
            contador++;

            if(player1.mostrarAtributo(atributo, jugado)>player2.mostrarAtributo(atributo, jugado2)){
                /* El jugador uno gano la mano - debe agregar la carta del vencido a su mano y se debe retirar la carta del mazo del jugador2 */
                player1.addCarta(jugado2);
                player2.removeCarta(jugado2);
                player1.mostrarMano();
                player2.mostrarMano();
            }
        }else{
            Personaje jugado = player2.jugarCarta();
            System.out.println(jugado.getNombreSuper());
            int atributo = player2.seleccionarAtributo();
            System.out.println(player2.mostrarAtributo(atributo, jugado));

            Personaje jugado2 = player1.jugarCarta();
            System.out.println(jugado2.getNombreSuper());
            System.out.println(player1.mostrarAtributo(atributo, jugado2));
            contador++;

            if(player2.mostrarAtributo(atributo, jugado)>player1.mostrarAtributo(atributo, jugado2)){
                /* El jugador uno gano la mano - debe agregar la carta del vencido a su mano y se debe retirar la carta del mazo del jugador2 */
                player1.addCarta(jugado2);
                player2.removeCarta(jugado2);
                player1.mostrarMano();
                player2.mostrarMano();
            }
        }
        
        
    }
    
}
