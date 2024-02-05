package ComparadorAutos;

public class ComparadorKm extends Comparador{
    public ComparadorKm(){}
    public ComparadorKm(Comparador siguiente){
        super(siguiente);
    }

    @Override
    public int comparando(Auto auto1, Auto auto2){
        return auto1.getKilometros() - auto2.getKilometros();
    }
}
