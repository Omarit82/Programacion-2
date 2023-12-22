package Clase_1.PRACTICA1.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona persona_2 = new Persona(29555208, "Omar", "Roselli", 2005, 7, 11, "Masculino", 92, 1.93,18);
        System.out.println(persona_2);
        System.out.println("Es coherente: "+persona_2.esCoherente());
        System.out.println("Es el cumpleaños? : "+ persona_2.cumpleanios());
        System.out.println("Puede votar? :"+persona_2.puedeVotar());
        System.out.println("Es Mayor de edad: "+persona_2.esMayorEdad());
    }
    
}
