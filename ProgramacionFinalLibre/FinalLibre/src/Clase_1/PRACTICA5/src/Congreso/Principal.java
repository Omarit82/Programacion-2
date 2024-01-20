package Congreso;

public class Principal {
    public static void main(String[] args) {
        Evaluador male = new Evaluador("Malena");
        Evaluador omar = new Evaluador("Omar");

        System.out.println(male.getId());
        System.out.println(omar.getId());
    }
}
