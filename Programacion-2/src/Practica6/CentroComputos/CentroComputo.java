package Practica6.CentroComputos;

public class CentroComputo {
    private ColaEspera computadoras;
    private ColaEspera procesos;

    public CentroComputo(){
        computadoras = new ColaEspera();
        procesos = new ColaEspera();
    }

    public void addComputadora(Computadora c){
        computadoras.agregarACola(c);
    }

    public void addProceso(Proceso p){
        if(computadoras.isEmpty()){
            procesos.agregarACola(p);
        }else{
           String resultado =  ejecutarProceso(p, computadoras.get());
           System.out.println(resultado);
        }
    }

    public String ejecutarProceso(ElementoCola p, ElementoCola c){
        computadoras.remove(c);
        return "Proceso "+p+" Ejecutado con la computadora : "+c;
    } 

    public String toString(){
        return computadoras.toString() + "\n"+procesos.toString();
    }

}
