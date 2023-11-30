package Practica7.Documentos;

public class CriterioSinKeyword extends Criterio {
    public boolean cumple(Documento doc){
        if(!doc.tieneKey()){
            return true;
        }else{
            return false;
        }
    }
}
