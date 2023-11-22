package Practica2.Series;

public class Ejecucion {
    public static void main(String[] args) {
        Episodio capitulo1 = new Episodio("1", "Este es el primer capitulo", true, 2);
        Episodio capitulo2 = new Episodio("2", "Este es el segundo capitulo", false, -1);
        Episodio capitulo3 = new Episodio("3", "Este es el tercer capitulo", true, 2);

        Episodio capitulo4 = new Episodio("1", "Este es el primer capitulo segunda temporada", true, 2);
        Episodio capitulo5 = new Episodio("2", "Este es el segundo capitulo segunda temporada", true, 4);
        Episodio capitulo6 = new Episodio("3", "Este es el tercer capitulo segunda temporada", true, 2);

        Episodio capitulo7 = new Episodio("1", "Este es el primer capitulo tercer temporada", true, 5);
        Episodio capitulo8 = new Episodio("2", "Este es el segundo capitulo tercer temporada", true, 4);
        Episodio capitulo9 = new Episodio("3", "Este es el tercer capitulo tercer temporada", true, 3);

        Temporada uno = new Temporada(1);
        Temporada dos = new Temporada(2);
        Temporada tres = new Temporada(3);

        uno.addEpisodio(capitulo1);
        uno.addEpisodio(capitulo2);
        uno.addEpisodio(capitulo3);
        dos.addEpisodio(capitulo4);
        dos.addEpisodio(capitulo5);
        dos.addEpisodio(capitulo6);
        tres.addEpisodio(capitulo7);
        tres.addEpisodio(capitulo8);
        tres.addEpisodio(capitulo9);


        Serie friends = new Serie("Friends", "Martha Kaufmman", "Esta es una serie", "SitCom");
        friends.addTemporada(uno);
        friends.addTemporada(tres);
        friends.addTemporada(dos);
        double promTemp1 = uno.getPromedio();
        double promTemp2 = dos.getPromedio();
        double promTemp3 = tres.getPromedio();
        System.out.println("El promedio de las temporadas uno dos y tres es: " + promTemp1+"|"+promTemp2+"|"+promTemp3);
        double prom = friends.getPromedio();
        System.out.println("El promedio de la serie es: " + prom);
        
    }
}
