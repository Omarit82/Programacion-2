package Alquiler;

public class Principal {
    public static void main(String[] args) {
        Cliente uno = new Cliente("Omar");
        Cliente dos = new Cliente("Malena");
        System.out.println(uno.getId());
        System.out.println(dos.getId());
    }
}
