package Plataforma;

import Plataforma.Busqueda.*;

public class Principal {
    public static void main(String[] args) {
        Plataforma flix = new Plataforma();

        Pelicula peli1 = new Pelicula("Inferno", "Pelicula basada en el libro Inferno, de Dan Brown", "Ron Howard", 2016, 121, 13);
        peli1.addActor("Tom Hanks");
        peli1.addActor("Felicity Jones");
        peli1.addActor("Ben Foster");
        peli1.addGenero("Thriller");
        peli1.addGenero("Accion");

        Pelicula peli2 = new Pelicula("Angeles y Demonios", "Pelicula basada en el libro Angeles y Demonios, de Dan Brown", "Ron Howard", 2009, 138, 13);
        peli2.addActor("Tom Hanks");
        peli2.addActor("Ayelet Zurer");
        peli2.addActor("Ewan McGregor");
        peli2.addGenero("Thriller");
        peli2.addGenero("Intriga");

        Pelicula peli3 = new Pelicula("El codigo Da Vinci", "Pelicula basada en el libro El codigo Da Vinci  de Dan Brown", "Ron Howard", 2006, 147, 13);
        peli3.addActor("Tom Hanks");
        peli3.addActor("Audrey Tautou");
        peli3.addActor("Ian McKellen");
        peli3.addGenero("Thriller");
        peli3.addGenero("Intriga");
        peli3.addGenero("Religion");

        flix.addPelicula(peli2);
        flix.addPelicula(peli3);
        flix.addPelicula(peli1);

        Filtro ff1 = new FiltroDuracion(120);
        Filtro ff2 = new FiltroNot(new FiltroGenero("Comedia"));
        Filtro ff3 = new FiltroAnd(ff1,ff2);
        /*
        Filtro ff4 = new FiltroOr(new FiltroNot(new FiltroPreviasAnio(2017)),new FiltroOr(new FiltroGenero("Infantil"), new FiltroGenero("Documental")));
        */
        Pelicula peli4 = new Pelicula("Nueve Reinas", "Pelicula Argentina", "Fabian Bielinsky", 2000, 121, 18);
        flix.addPelicula(peli4, new Rentable(ff3));
        
        System.out.println(flix);
    }
}
