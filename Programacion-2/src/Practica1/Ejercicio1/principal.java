package Practica1.Ejercicio1;

import Practica1.Ejercicio3.Rectangulo;

//import Practica1.Ejercicio2.Electrodomestico;
//import Practica1.Ejercicio3.Punto_geometrico;

public class principal {
    public static void main(String[] args) {
        
        // -- Ejercicio 1 --
        /**
            Persona Omar = new Persona(29555208);
            System.out.println(Omar.getBirthDate());
            System.out.println(Omar.getIndiceMasaCorporal());

            Persona Malena = new Persona (31625325,"Malena Laura","Griffiths",2005,10,27,'f',45,1.68);
            System.out.println(Malena.getInfo());
        */
        // -- Ejercicio 2 --
        /** Electrodomestico microondas = new Electrodomestico();
            microondas.setConsumo(44);
            microondas.setPeso(76);
            System.out.println(microondas.getBajoConsumo());
            System.out.println(microondas.getBalance());
            System.out.println(microondas.getAltaGama());
         */
        // -- Ejercicio 3 --
        /** Punto_geometrico pto = new Punto_geometrico();
            System.out.println(pto.getDistancia(1, 1));
            System.out.println(pto.getDesplazamiento(3, 5)  );
            System.out.println(pto.getDistancia(1, 1));
         */
        Rectangulo rect = new Rectangulo(0,0,2,5);

        rect.setDesplazamiento(1, -2);

        System.out.println(rect.getPto1coorX()+","+rect.getPto1coorY());
        System.out.println(rect.getPto2coorX()+","+rect.getPto2coorY());

  


    }
}
