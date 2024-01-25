package CentroComputosV3;

public class ListaOrdenadaCompu extends ListaOrdenada{

    @Override
    public boolean esMayor(Object it1,Object it2) {
        Computadora pp1 = (Computadora) it1;
        Computadora pp2 = (Computadora) it2;
        
        if(pp1.getVelocidad()>pp2.getVelocidad()){
            return true;
        }else{
            return false;
        }
    }

    public void agregarCompu(Computadora cc1){
        super.agregarItem(cc1);
    }
}
