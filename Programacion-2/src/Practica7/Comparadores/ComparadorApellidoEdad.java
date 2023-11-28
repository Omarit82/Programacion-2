package Practica7.Comparadores;

import java.util.Comparator;

public class ComparadorApellidoEdad implements Comparator<Persona>{
    
    private ComparadorApellido cApellido;
    private ComparadorEdad cEdad;

    public ComparadorApellidoEdad(){
        this.cApellido = new ComparadorApellido();
        this.cEdad = new ComparadorEdad();
    } 

    public int compare(Persona per1, Persona per2){
        int aux = cApellido.compare(per1,per2);
        if(aux == 0){
            aux = cEdad.compare(per1, per2);
        }
        return aux;
    }

}
