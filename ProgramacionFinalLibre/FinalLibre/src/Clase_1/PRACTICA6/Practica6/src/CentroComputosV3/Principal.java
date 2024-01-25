package CentroComputosV3;

public class Principal {
    public static void main(String[] args) {
        Centro centro = new Centro();
        Computadora compu1 = new Computadora(1250);
        Computadora compu2 = new Computadora(2500); 
        Computadora compu3 = new Computadora(3250); 
        Computadora compu4 = new Computadora(750); 
        Computadora compu5 = new Computadora(4800);  

        centro.agregarCompu(compu1);
        centro.agregarCompu(compu2);
        centro.agregarCompu(compu3);
        centro.agregarCompu(compu4);
        centro.agregarCompu(compu5);
        System.out.println(centro.listarComputadoras());

        Proceso pp1 = new Proceso(520);
        Proceso pp2 = new Proceso(450);
        Proceso pp3 = new Proceso(750);
        Proceso pp4 = new Proceso(345);
        centro.agregarProceso(pp1);
        centro.agregarProceso(pp2);
        centro.agregarProceso(pp3);
        centro.agregarProceso(pp4);

        System.out.println(centro.listarProcesos());
       
    }
}
