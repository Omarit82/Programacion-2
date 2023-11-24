package Practica6.CentroComputos;

public class Principal {
    /*
    *       2. Centro de Cómputos

    Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
    computadoras que dispone. 
    Si no hay computadoras disponibles los procesos a ejecutar deben esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer lugar). 
    Las computadoras disponibles para ejecutar procesos se ordenan en una cola que prioriza la selección de las computadoras más rápidas.
    
    */

    public static void main(String[] args) {
        Proceso p1 = new Proceso(200);
        Proceso p2 = new Proceso(150);
        Proceso p3 = new Proceso(275);

        System.out.println(p1.getIdProceso());
        System.out.println(p2.getIdProceso());
        System.out.println(p3.getIdProceso());

        System.out.println(p1.esMayor(p2));
        System.out.println(p2.esMayor(p3));

        Computadora c1 = new Computadora(275);
        Computadora c2 = new Computadora(375);
        Computadora c3 = new Computadora(200);
        Computadora c4 = new Computadora(180);

        System.out.println(c1.getIdComputadora());
        System.out.println(c2.getIdComputadora());
        System.out.println(c3.getIdComputadora());
        System.out.println(c4.getIdComputadora());
        
        System.out.println(c1.esMayor(c4));
        System.out.println(c1.esMayor(c2));
    }
}
