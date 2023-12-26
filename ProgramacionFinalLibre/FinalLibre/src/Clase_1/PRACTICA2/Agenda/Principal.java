package Clase_1.PRACTICA2.Agenda;

public class Principal {
    public static void main(String[] args) {
        Integrante int1 = new Integrante("Omar", "Roselli", "omar@email.com",  4379450);
        Integrante int2 = new Integrante("Malena", "Griffiths", "malena@email.com", 1234567);
        System.out.println(int1);
        System.out.println(int2);
        Reunion r1 = new Reunion("Deitres", "Sueldos", 1);
        Reunion r2 = new Reunion("Sum", "Fiesta", 1);
        Reunion r3 = new Reunion("Oficina", "Otro tema", 2);
        Agenda ag = new Agenda();
        r1.addIntegrante(int2);
        r1.addIntegrante(int1);
        r2.addIntegrante(int2);
        r3.addIntegrante(int1);

        ag.addReunion(r1);
        ag.addReunion(r3);
        ag.addReunion(r2);
        System.out.println(ag);
    }
    
}
