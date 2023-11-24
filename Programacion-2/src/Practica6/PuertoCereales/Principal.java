package Practica6.PuertoCereales;

import java.time.LocalDate;

public class Principal {
    /** Un puerto debe coordinar las actividades de carga de los barcos con cereal traído por
        camiones desde el campo. Sólo se puede cargar un barco a la vez. Los barcos que esperan ser
        cargados se ubican en una cola de espera que los ordena teniendo en cuenta su capacidad (los
        barcos con mayor capacidad serán atendidos en primer lugar). Sólo se puede descargar un
        camión a la vez. Los camiones que esperan ser descargados se ubican en una cola de espera
        que los ordena teniendo en cuenta la fecha en que fueron cargados (los camiones que fueron
        cargados primero serán atendidos en primer lugar).*/
    public static void main(String[] args) {
        Barco b1 = new Barco(1500);
        Barco b2 = new Barco(2500);

        Camion c1 = new Camion(LocalDate.of(2023,11,22));
        Camion c2 = new Camion(LocalDate.of(2023,11,15));
        Camion c3 = new Camion(LocalDate.of(2023,11,24));
        Camion c4 = new Camion(LocalDate.of(2023,10,30));


        Puerto pp = new Puerto();

        pp.addBarco(b1);
        pp.addBarco(b2);
        pp.addCamion(c1);
        pp.addCamion(c2);
        pp.addCamion(c3);
        pp.addCamion(c4);

        System.out.println(pp);

       

    }
    
}
