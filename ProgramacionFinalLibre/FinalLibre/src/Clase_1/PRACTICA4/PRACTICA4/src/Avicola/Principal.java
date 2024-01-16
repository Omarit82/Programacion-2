package Avicola;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Producto prod1 = new Producto(LocalDate.of(2024, 1, 25), 23);
        System.out.println(prod1);
        Producto prod2 = new Fresco(LocalDate.of(2024, 1, 23), 27, LocalDate.of(2023, 12, 15), "Los Alemanes");
        System.out.println(prod2);
        Producto prod3 = new Refrigerado(LocalDate.of(2024,1,20), 0012, 123, 10, "El Holandes", LocalDate.of(2023, 11, 20));

        System.out.println(prod3);
    }
    
}
