package Seleccion;

public class Principal {
    public static void main(String[] args) {
        Seleccion argentina = new Seleccion();
        Integrante tecnico = new Entrenador("Lionel","Scaloni",29555208,1980,5,25,"AFA");
        argentina.agregarIntegrante(tecnico);

        Integrante masajista = new Masajista("Jose","Gimenez",1234567,1975,7,8,"Fisioterapista",5);
        argentina.agregarIntegrante(masajista);

        Futbolista arquero1 = new Futbolista("Sergio", "Romero", 456789, 1987, 9, 23, "Arquero", "derecha");
        Futbolista arquero2 = new Futbolista("Dibu", "Martinez", 897645, 1995, 11, 23, "Arquero", "derecha");
        argentina.agregarIntegrante(arquero2);
        argentina.agregarIntegrante(arquero1);

        argentina.personalDisponible();

    }
    
}
