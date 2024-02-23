package Futbol5;

import java.time.LocalDate;

import Futbol5.Comparadores.*;
import Futbol5.Filtros.*;
public class Main {
    public static void main(String[] args) {
        Socio uno = new Socio("Omar", "Roselli", 18, false);
        Socio dos = new Socio("Roberto", "Pascual", 15, true);
        Socio tres = new Socio("Juan", "Roselli", 17, true);
        Socio cuatro = new Socio("MAlena", "Griffiths", 13, false);

        Predio quintana = new Predio();
        quintana.addSocio(uno);
        quintana.addSocio(dos);
        quintana.addSocio(tres);
        quintana.addSocio(cuatro);

        Alquiler a = new Alquiler(LocalDate.now(),5, 650);
        Alquiler b = new Alquiler(LocalDate.now(),5, 750);
        Alquiler c = new Alquiler(LocalDate.now(),6, 650);
        uno.addAlquiler(a);
        uno.addAlquiler(b);
        uno.addAlquiler(c);

        Alquiler d = new Alquiler(LocalDate.now(),5, 450);
        Alquiler e = new Alquiler(LocalDate.now(),5, 750);
        Alquiler f = new Alquiler(LocalDate.now(),5, 650);
        dos.addAlquiler(d);
        dos.addAlquiler(e);
        dos.addAlquiler(f);

        Alquiler g = new Alquiler(LocalDate.now(),7, 450);
        Alquiler h = new Alquiler(LocalDate.now(),5, 750);
        Alquiler i = new Alquiler(LocalDate.now(),6, 650);
        tres.addAlquiler(g);
        tres.addAlquiler(h);
        tres.addAlquiler(i);

        Alquiler j = new Alquiler(LocalDate.now(),7, 450);
        Alquiler k = new Alquiler(LocalDate.now(),8, 750);
        Alquiler l = new Alquiler(LocalDate.now(),6, 650);
        cuatro.addAlquiler(j);
        cuatro.addAlquiler(k);
        cuatro.addAlquiler(l);
        
        /*Los socios con cuota impaga ordenados por Apellido y Nombre 
        System.out.println(quintana.obtenerListado(new FiltroCuotaImpaga(), new ComparadorCompuesto(new ComparadorApellido(), new ComparadorNombre())));
        /*Los socios menores de edad ordenados por Edad- 
        System.out.println(quintana.obtenerListado(new FiltroMenorEdad(18),new ComparadorEdad()));
        /*Los socios que alquilaron una cancha determinada ordenados por cantidad de veces que la alquilaron. 
        System.out.println(quintana.obtenerListado(new FiltroAlquilerCancha(5), new CompCantidadAlquileres(5)));
        /*Todos los socios que pagaron mas de 500 por algun alquiler listando primero a los que tienen las cuotas pagas ordenados alfabeticamente y luego los morosos tambien alfabeticamente. */
        System.out.println(quintana.obtenerListado(new FiltroPago(500),new ComparadorCompuesto(new ComparadorCuota(), new ComparadorApellido())));
    }
    
}
