package TPEspecial;

public class Main {
    public static void main(String[] args) {
        Carta superman = new Carta("Superman");
        Carta flash = new Carta("Flash");
        Carta firestorm = new Carta("Firestorm");
        Carta manhunter = new Carta("Manhunter");
        Carta batman = new Carta("Batman");
        Carta shazam = new Carta("Shazam");
        Carta wonderWoman = new Carta("Wonder Woman");
        Carta blueBeetle = new Carta("Blue Bettle");
        
        superman.addAtributo(new Atributo("Altura", 2.05));
        superman.addAtributo(new Atributo("Peso", 110));
        superman.addAtributo(new Atributo("Fuerza", 2000));
        superman.addAtributo(new Atributo("Peleas ganadas", 900));
        superman.addAtributo(new Atributo("Velocidad", 550));

        flash.addAtributo(new Atributo("Altura", 1.95));
        flash.addAtributo(new Atributo("Peso", 90));
        flash.addAtributo(new Atributo("Fuerza", 840));
        flash.addAtributo(new Atributo("Peleas ganadas", 870));
        flash.addAtributo(new Atributo("Velocidad", 1200));

        firestorm.addAtributo(new Atributo("Altura", 1.75));
        firestorm.addAtributo(new Atributo("Peso", 95));
        firestorm.addAtributo(new Atributo("Fuerza", 700));
        firestorm.addAtributo(new Atributo("Peleas ganadas", 815));
        firestorm.addAtributo(new Atributo("Velocidad", 750));
        
        manhunter.addAtributo(new Atributo("Altura", 1.75));
        manhunter.addAtributo(new Atributo("Peso", 95));
        manhunter.addAtributo(new Atributo("Fuerza", 700));
        manhunter.addAtributo(new Atributo("Peleas ganadas", 815));
        manhunter.addAtributo(new Atributo("Velocidad", 750));

        batman.addAtributo(new Atributo("Altura", 1.80));
        batman.addAtributo(new Atributo("Peso", 95));
        batman.addAtributo(new Atributo("Fuerza", 320));
        batman.addAtributo(new Atributo("Peleas ganadas", 1000));
        batman.addAtributo(new Atributo("Velocidad", 350));

        shazam.addAtributo(new Atributo("Altura", 2.10));
        shazam.addAtributo(new Atributo("Peso", 100));
        shazam.addAtributo(new Atributo("Fuerza", 375));
        shazam.addAtributo(new Atributo("Peleas ganadas", 420));
        shazam.addAtributo(new Atributo("Velocidad", 450));

        wonderWoman.addAtributo(new Atributo("Altura", 1.78));
        wonderWoman.addAtributo(new Atributo("Peso", 70));
        wonderWoman.addAtributo(new Atributo("Fuerza", 970));
        wonderWoman.addAtributo(new Atributo("Peleas ganadas", 1200));
        wonderWoman.addAtributo(new Atributo("Velocidad", 650));

        blueBeetle.addAtributo(new Atributo("Altura", 1.70));
        blueBeetle.addAtributo(new Atributo("Peso", 65));
        blueBeetle.addAtributo(new Atributo("Fuerza", 400));
        blueBeetle.addAtributo(new Atributo("Peleas ganadas", 500));
        blueBeetle.addAtributo(new Atributo("Velocidad", 400));

        Mazo mazo = new Mazo();

        mazo.addCarta(superman);
        mazo.addCarta(firestorm);
        mazo.addCarta(manhunter);
        mazo.addCarta(flash);
        mazo.addCarta(batman);
        mazo.addCarta(shazam);
        mazo.addCarta(wonderWoman);
        mazo.addCarta(blueBeetle);

        Jugador player1 = new Jugador("Malena");
        Jugador player2 = new Jugador("Omar");
        
        Juego juego =new Juego(player1, player2, mazo);
        juego.jugar(12);
       
    }
    
}
