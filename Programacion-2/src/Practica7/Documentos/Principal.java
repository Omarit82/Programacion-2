package Practica7.Documentos;

public class Principal {

    public static void main(String[] args) {
        Documento doc1 = new Documento("Questo", "");
        Documento doc2 = new Documento("Roba", "questa e una cosa molto piu importante");
        Documento doc3 = new Documento("Rabos", "Otro contenido");
        Documento doc4 = new Documento("Romas", "algo");

        Coleccion coleccion = new Coleccion();
        coleccion.addDocumento(doc4);
        coleccion.addDocumento(doc1);
        coleccion.addDocumento(doc2);
        coleccion.addDocumento(doc3);
        //doc2.addKeyword("Omar");

    
        Criterio crit1 = new CriterioTitulo("Roba");
        Criterio crit2 = new CriterioFrase("algo");
        Criterio crit3 = new CriterioKeyword("Omar");
        Criterio crit4 = new CriterioNoContiene("Omar");
        Criterio crit5 = new CriterioSinKeyword();
        
        //System.out.println(coleccion.Buscar(crit1));

       // System.out.println(coleccion.Buscar(crit2));

        System.out.println(coleccion.Buscar(crit5));
    }
    
}
