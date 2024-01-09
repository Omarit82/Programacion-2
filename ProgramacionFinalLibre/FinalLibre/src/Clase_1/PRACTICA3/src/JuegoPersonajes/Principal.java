package JuegoPersonajes;

/*3 Juego de Personajes
Se desea modelar un juego el cual se compone de héroes y villanos. Cada personaje del
juego posee un nombre real, un nombre de super héroe y un conjunto de cualidades o
características, que son visión nocturna, velocidad, fuerza peso, altura y edad. Cada una
de estas posee un nivel asociado, por ejemplo velocidad 500, fuerza 700, edad 33.
El mecanismo de juego se basa en enfrentar un personaje con otro y decidir cuál de
ellos es el ganador. Para decidir quién es el ganador se utiliza el valor de una de las
características, por ejemplo fuerza, velocidad. En caso de empate se decide por el valor
de otra característica dada.
Consejo: Identificar las reglas del juego y en dónde deben estar. Ver Jugador.
 */

public class Principal {
    public static void main(String[] args) {
        Personaje carta1 = new Personaje("Clark Kent", "Superman", 95, 75, 80, 90, 190, 35);
        Personaje carta2 = new Personaje("Bruce Waine", "Batman", 75, 65, 52, 92, 192, 37);
        Personaje carta3 = new Personaje("Peter Parker", "Spider-Man", 72 , 97, 65, 70, 175, 18);
        Personaje carta4 = new Personaje("Bruce Banner", "Hulk", 25, 40, 92, 120, 205, 40);

        Mazo mazoDeCartas = new Mazo();

        mazoDeCartas.addCarta(carta1);
        mazoDeCartas.addCarta(carta2);
        mazoDeCartas.addCarta(carta3);
        mazoDeCartas.addCarta(carta4);

        Jugador player1 = new Jugador("Omar");
        Jugador player2 = new Jugador("Malena");

        Juego supers = new Juego(player1, player2, mazoDeCartas);

        mazoDeCartas.dealMazo(player1,player2);

        //player1.mostrarMano();
        //player2.mostrarMano();
        supers.mano();
   
        
    }
}
