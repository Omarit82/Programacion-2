package ComparadorV3;

public class ComparadorApellido extends ComparadorPersona {

    public ComparadorApellido(){}
    public ComparadorApellido(ComparadorPersona com){
        super(com);
    }
   
    @Override
    public int comparar(Persona p1, Persona p2) {
        return p1.getApelllido().compareTo(p2.getApelllido());
    }
    
}
