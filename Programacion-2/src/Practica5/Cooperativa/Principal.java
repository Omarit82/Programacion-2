package Practica5.Cooperativa;

public class Principal {   
   public static void main(String[] args) {
      Lote l = new Lote(50);
      l.addMineral("sodio");
      l.addMineral("potasio");
      l.addMineral("litio");

      Cereal c = new Cereal("soja");
      c.addMineralRequerio("sodio");
      c.addMineralRequerio("potasio");

      Pastura p = new Pastura("Alfalfa", 75);
      p.addMineralRequerio("litio");

      Cooperativa coop = new Cooperativa();
      coop.addMineralInteres("plutonio");

      System.out.println(coop.loteEspecial(l));
   }

}
