package Futbol5.Comparadores;
import Futbol5.Socio;
public class ComparadorCuota extends Comparador {
    @Override
    public int compare(Socio ss1, Socio ss2){
        if(ss1.isCuotaPaga() && ss2.isCuotaPaga() || !ss1.isCuotaPaga()&&!ss2.isCuotaPaga()){
            return 0;
        }else{
            if(ss1.isCuotaPaga()&&!ss2.isCuotaPaga()){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
