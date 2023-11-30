package Practica7.Documentos;
import java.util.ArrayList;

public class Coleccion {

    private ArrayList<Documento> documentos;

    public Coleccion(){
        this.documentos = new ArrayList<Documento>();
    }
    
    public void addDocumento(Documento documento){
        documentos.add(documento);
    }

    public ArrayList<Documento> Buscar(Criterio c){
        ArrayList<Documento> auxiliar = new ArrayList<>();
        for (Documento doc : documentos) {
            if(c.cumple(doc)){
                auxiliar.add(doc);
            }
        }
        return auxiliar;
    }

    
}
