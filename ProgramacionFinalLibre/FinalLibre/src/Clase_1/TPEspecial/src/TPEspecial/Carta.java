package TPEspecial;
import java.util.ArrayList;
import java.util.Collections;

public class Carta {
    private String nombre;
    private ArrayList<Atributo> atributos;

    public Carta(String nombre){
        atributos = new ArrayList<>();
        this.nombre=nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addAtributo(Atributo atributo){
        /*--Chequeo duplicados--*/
        /*--defino el equals en la clase Atributo--*/
        if(!atributos.contains(atributo)){
            atributos.add(atributo);
            Collections.sort(atributos);
        }
    }
    
    public int seleccionAtributo(){
        return (int) ((Math.random()*cantidadAtributos())+1);
    }
    public Atributo getAtributo(int index){
        return atributos.get(index-1);
    }

    public int cantidadAtributos(){
        return atributos.size();
    }
    /*--Controla si una carta pasada por parametro pertenece al mismo mazo que this. */
    public boolean mismoMazo(Carta carta){
        if(cantidadAtributos() == carta.cantidadAtributos()){
            int i=0;
            boolean igualdad = true;
            while(igualdad && i<cantidadAtributos()){
                if(!atributos.contains(carta.getAtributo(i))){
                    igualdad = false;
                }
                i++;
            }
            return igualdad;
        }
        return false;
    }
    /*--Equals para Cartas */
    /*--Debo chequear mismo nombre y mismo valor numerico de cada atributo--*/
    @Override
    public boolean equals(Object obj){
        try {
            Carta aux = (Carta) obj;
            if(this.mismoMazo(aux)){
                int i = 0;
                boolean igualdad = true;
                
                while(igualdad && i< this.cantidadAtributos()){
                    if(!(atributos.get(i).getNombre().equals(aux.getAtributo(i).getNombre())&&
                    atributos.get(i).getValorNumerico()==aux.getAtributo(i).getValorNumerico())){
                        igualdad = false;
                    }
                    i++;
                }
                return igualdad;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public String toString() {
        return getNombre()+": \n" + atributos;
    }
}
