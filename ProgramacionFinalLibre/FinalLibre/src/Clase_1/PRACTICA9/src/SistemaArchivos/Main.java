package SistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Archivo uno = new Archivo("Primero", LocalDate.of(1995,7,8), 12);
        Archivo dos = new Archivo("Segundo", LocalDate.of(1999,5,5), 15);
        Archivo tres = new Archivo("Terecero", LocalDate.of(2008,1,12), 5);
        Archivo cuatro = new Archivo("Cuarto", LocalDate.of(1993,2,25), 8);
        Directorio dUno = new Directorio("Directorio1", LocalDate.of(2012,2,2));
        Directorio dDos = new Directorio("Directorio2", LocalDate.of(2020,8,25));
        Directorio dTres = new Directorio("Directorio3", LocalDate.of(2011,2,2)); 
        Link a = new Link(uno, LocalDate.of(2020,2,2));
        Link b = new Link(dos, LocalDate.of(2021,5,6));
        Link c = new Link(tres, LocalDate.of(2023,9,2));

        dUno.agregaElemento(uno);
        dUno.agregaElemento(dDos);
        dDos.agregaElemento(dos);
        dDos.agregaElemento(tres);
        dDos.agregaElemento(dTres);
        dTres.agregaElemento(cuatro);

        Comprimido com = new Comprimido("Comprimido", LocalDate.of(2024,1,5), 0.8);
        com.agregaElemento(uno);
        com.agregaElemento(dTres);
        com.agregaElemento(a);
        com.agregaElemento(b);
        com.agregaElemento(c);
        
    }
    
}
