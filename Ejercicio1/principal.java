package Practica1.Ejercicio1;

public class principal {
    public static void main(String[] args) {
        
        // creo una persona!

        Persona Omar = new Persona(29555208);
        System.out.println(Omar.getBirthDate());
        System.out.println(Omar.getIndiceMasaCorporal());

        Persona Malena = new Persona (31625325,"Malena Laura","Griffiths",1985,9,27,'f',45,1.68);
        System.out.println("IMC: "+Malena.getIndiceMasaCorporal()+" : "+Malena.getEnForma());
        System.out.println(Malena.getCumpleannos());
        System.out.println(Malena.getBirthDate());
        System.out.println(Malena.getYear()+"-"+Malena.getMes()+"-"+Malena.getDay());
        
    }
}
