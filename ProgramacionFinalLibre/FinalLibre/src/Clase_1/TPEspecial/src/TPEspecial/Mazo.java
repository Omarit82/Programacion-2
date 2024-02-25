package TPEspecial;

import java.util.ArrayList;

public class Mazo {
    private ArrayList<Carta> cartas;

    public Mazo (){
        cartas = new ArrayList<>();
    }

    public void addCarta(Carta carta){
    /*--No debo poder ingresar dos veces la misma carta--*/
    /*--Defino el equals de la Carta */
        if(!cartas.contains(carta)){
            cartas.add(carta);
        }
    }

    /*--Cantidad de cartas--*/
    public int cantidadCartas(){
        return cartas.size();
    }

    public Carta repartirCarta(){
        /*--Toma una carta cualquiera del mazo--*/
        int index =(int)(Math.random()*cartas.size());
        return cartas.remove(index);
    }

    /*--Control de atributos de las cartas--*/
    public boolean controlCartas(){
        for (Carta carta : cartas) {
            boolean control = true;
            int i=0;
            while(control && i< cartas.size()){
                if(!carta.mismoMazo(cartas.get(i))){
                    control = false;
                }
                i++;
            }
            if(!control){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mazo [cartas=" + cartas + "]";
    }

    
}
