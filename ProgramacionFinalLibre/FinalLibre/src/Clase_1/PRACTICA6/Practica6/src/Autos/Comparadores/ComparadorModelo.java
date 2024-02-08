package Autos.Comparadores;
import Autos.Auto;
public class ComparadorModelo extends Comparador{

    public ComparadorModelo(){}
    public ComparadorModelo(Comparador siguiente){
        super(siguiente);
    }

    @Override
    public int comparando(Auto auto1, Auto auto2){
        return auto1.getModelo().compareTo(auto2.getModelo());
    }
}
