package Practica7.Comparadores;

import java.util.Comparator;


public class ComparadorApellidoNombre implements Comparator<Persona>{
    private ComparadorApellido compAp;
    private ComparadorNombre compNombre;

    public ComparadorApellidoNombre(){
        this.compAp = new ComparadorApellido();
        this.compNombre = new ComparadorNombre();
    } 

    public int compare(Persona per1, Persona per2){
        int aux = compAp.compare(per1,per2);
        if(aux == 0){
            aux = compNombre.compare(per1, per2);
        }
        return aux;
    }

}
