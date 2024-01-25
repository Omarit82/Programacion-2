package CentroComputosV3;

public class ListaOrdenadaProcesos extends ListaOrdenada{

    @Override
    public boolean esMayor(Object it1,Object it2) {
        Proceso pp1 = (Proceso) it1;
        Proceso pp2 = (Proceso) it2;
        
        if(pp1.getMemoria()>pp2.getMemoria()){
            return true;
        }else{
            return false;
        }
    }

    public void agregarProceso(Proceso cc1){
        super.agregarItem(cc1);
    }

}