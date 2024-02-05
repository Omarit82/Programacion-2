package ComparadorAutos;

public class ComparadorMarca extends Comparador {

    public ComparadorMarca(){}

    public ComparadorMarca(Comparador siguiente){
        super(siguiente);
    }

    @Override
    public int comparando(Auto auto1, Auto auto2){
        return auto1.getMarca().compareTo(auto2.getMarca());
    }
    
}
