package Farmacia;

public class Principal {
    public static void main(String[] args) {
        Criterio cr = new CriterioLab("Bayer");

        Farmacia farm = new Farmacia();
        Medicamento med1 = new Medicamento("Aspirina", "Bayer", 250.25);
        Medicamento med2 = new Medicamento("Presion","Bayer",275.20);
        Medicamento med3 = new Medicamento("Otro", "Bago", 145.20);

        farm.addMed(med1);
        farm.addMed(med2);
        farm.addMed(med3);

        System.out.println(farm.busqueda(cr));
    }
}
