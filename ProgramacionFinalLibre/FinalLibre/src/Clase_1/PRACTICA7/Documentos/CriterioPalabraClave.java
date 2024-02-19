public class CriterioPalabraClave extends Criterio{

    private String palabra;

    public CriterioPalabraClave(String palabra){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento doc){
        if(doc.tienePalabra(palabra)){
            return true;
        }else{
            return false;
        }
    }
    
}
