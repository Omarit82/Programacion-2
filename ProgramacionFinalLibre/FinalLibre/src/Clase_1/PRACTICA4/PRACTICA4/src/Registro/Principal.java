package Registro;

public class Principal {
    public static void main(String[] args) {
        Empleado em1 = new Empleado("Omar", "Roselli", 41, 123456, 75000);
        Usuario us1 = new Usuario("Malena", "Griffiths", 38, "malenita", "12345");
        Jerarquico jer1 = new Jerarquico("Carlos", "Perez", 54, 789456, 85000);

        Empresa emp = new Empresa();

        emp.agregarPersonal(jer1);
        emp.agregarPersonal(us1);
        emp.agregarPersonal(em1);

        emp.listarPersonal();
    }
}
