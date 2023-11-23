package Practica4.Avicola;

import java.time.LocalDate;

public class Granja {
    public static void main(String[] args) {
        CongeladoAgua producto1 = new CongeladoAgua(LocalDate.of(2023, 11, 22),1, LocalDate.of(2023, 12, 22), "Los alemanes", 2, 10, 5);
        System.out.println(producto1);
    }
    
}
