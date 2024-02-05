package ComparadorAutos;
import java.util.ArrayList;
import java.util.Collections;

public class Automoviles {
    private ArrayList<Auto> autos;
    
    public Automoviles(){
        autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a1){
        autos.add(a1);
    }

    public ArrayList<Auto> porAnio(){
        ArrayList<Auto> aux = new ArrayList<>();
        aux = autos;
        Comparador com = new ComparadorAnio();
        Collections.sort(aux,com);
        return aux;
    }

    public ArrayList<Auto> porKm(){
        ArrayList<Auto> aux = new ArrayList<>();
        aux = autos;
        Comparador com = new ComparadorKm();
        Collections.sort(aux,com);
        return aux;
    }

    public Auto masNuevoMenosKm(){
        Comparador com2 = new ComparadorKm();
        Comparador com1 = new ComparadorAnio(com2);
        Collections.sort(autos, com1);
        return autos.get(0);
    }

    public ArrayList<Auto> retColor(String color){
        ArrayList<Auto> arreglo = new ArrayList<>();
        Comparador auxiliar = new ComparadorKm();
        Comparador com = new ComparadorAnio(auxiliar);
        for (Auto movil : autos) {
            if(movil.getColor().equals(color)){
                arreglo.add(movil);
            }
        }
        Collections.sort(arreglo,com);
        return arreglo;
    }
}
