package ContactosCelular;

public class Principal {
    public static void main(String[] args) {
        Contacto primero = new Contacto("Tandil","Omar", "Roselli", 4379450, "Vivorata 2968", "omar@email.com", 9, 1, 1982);
        Contacto segundo = new Contacto("Mar del Plata", "Malena", "Griffiths", 1234567, "Vivorata 2968", "malena@email.com", 1, 7, 1985);
        Contacto tercero = new Contacto("Tandil", "Roberto", "Roselli", 4379450, "Almafuerte 845", "rober@email.com", 27, 6, 1985);

        Celular celu = new Celular();
        celu.addContacto(primero);
        celu.addContacto(segundo);
        celu.addContacto(tercero);

        celu.showContactos();
        celu.resumen();
        celu.repetidos();

        celu.mismoNumeroTel();

    }
}
