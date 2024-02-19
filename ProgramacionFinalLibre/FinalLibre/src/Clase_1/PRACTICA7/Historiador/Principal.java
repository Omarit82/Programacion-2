package Historiador;

import Historiador.Criterios.*;

public class Principal {
    public static void main(String[] args) {
        Historiador his = new Historiador();
        Documento doc1 = new Documento("El amor en los tiempos del colera", "este es un libro");
        Documento doc2 = new Documento("El amor", "Este es otro libro mas");
        Documento doc3 = new Documento("Los anillos del Nivelungo", "Reseña opera alemana");
        Documento doc4 = new Documento("El señor de los anillos", "Libro de JJ Tolkien dividido en tres tomos, con muchos personajes ficticios. Se encuentran elfos, enanos, hombres, hobbits y orcos");

        doc1.addAutor("Garcia Marquez");
        doc2.addAutor("Carlos");
        doc3.addAutor("Martin");
        doc2.addAutor("Martin");
        doc4.addAutor("Tolkien");
        his.addDocumento(doc4);
        his.addDocumento(doc3);
        his.addDocumento(doc2);
        his.addDocumento(doc1);

        Criterio criterio = new CriterioAutor("Martin");
        Criterio criterio2 = new CriterioPalabraTitulo("anillos");
        Criterio criterio3 = new CriterioAnd(criterio, criterio2);
        Criterio criterio4 = new CriterioCantidadPalabras(3);
        System.out.println(his.busqueda(criterio4));
        System.out.println(his.busqueda(criterio3));
    }
    
}
