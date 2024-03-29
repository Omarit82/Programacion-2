package Historiador.src;

import java.util.ArrayList;

import Historiador.src.Criterios.Criterio;

public class Historiador {
    /*Un historiador desea digitalizar sus documentos y organizarlos de acuerdo a palabras clave.
    Un documento tiene un título, una lista de autores, un contenido textual y una lista de
    palabras clave. 
    El historiador necesita poder encontrar fácilmente documentos en su
    colección de acuerdo a diferentes criterios, por ejemplo:
    a) Todos los documentos cuyo título sea exactamente igual a un título dado. LISTO
    b) Todos los documentos cuyo título contenga una palabra o frase dada. LISTO
    c) Todos los documentos que contengan una palabra clave dada. LISTO
    d) Todos los documentos que no contengan ninguna palabra clave. LISTO
    e) Todos los documentos de un autor determinado. LISTO
    f) Todos los documentos cuyo contenido tenga una palabra o frase dada. LISTO
    g) Todos los documentos cuyo contenido tenga al menos 20 palabras.LISTO
    h) Cualquier combinación lógica de las formas anteriores 
    
    */

    /*hay que aplicar criterios de busqueda. */

    private ArrayList<Documento> documentos;

    public Historiador(){
        documentos = new ArrayList<>();
    }

    public void addDocumento(Documento doc){
        if(!documentos.contains(doc)){
            documentos.add(doc);
        }
    }

    public ArrayList<Documento> busqueda(Criterio cc){
        ArrayList<Documento> auxiliar = new ArrayList<>();
        for (Documento documento : documentos) {
            if(cc.cumple(documento)){
                auxiliar.add(documento);
            }
        }

        return  auxiliar;
    }
}
