package Practica7.Documentos;

public class Principal {

    public static void main(String[] args) {
        Documento doc1 = new Documento("Roba", "questa e una cosa piu importante");
        Documento doc2 = new Documento("Roba", "questa e una cosa molto piu importante");
        Documento doc3 = new Documento("Rabos", "");

        Coleccion coleccion = new Coleccion();

        coleccion.addDocumento(doc1);
        coleccion.addDocumento(doc2);
        coleccion.addDocumento(doc3);

    
        CriterioTitulo crit1 = new CriterioTitulo("Roba");

        
        System.out.println(coleccion.Buscar(crit1));
    }
    
}
