package Alarma;

public class AlarmaLuminosa {
    /*Atributos */
    private boolean vidrio;
    private boolean apertura;
    private boolean movimiento;
    private Timbre timbre;
    private Luz luz;

    public AlarmaLuminosa(Timbre timbre,Luz luz){
        vidrio = false;
        apertura = false;
        movimiento = false;
        this.timbre = timbre;
        this.luz = luz;
    }

    public void roturaVidrio(){
        vidrio = true;
    }

    public void apertura(){
        apertura = true;
    }

    public void movimiento(){
        movimiento = true;
    }

    public void comprobar(){
        if((vidrio)||(apertura)||(movimiento)){
            System.out.println(timbre.hacerSonar());
            System.out.println(luz.encender());
        }else{
            System.out.println("Todo ok!");
        }
    }

    public static void main(String[] args) {
        Luz luz = new Luz();
        Timbre timbre = new Timbre();

        AlarmaLuminosa alarma = new AlarmaLuminosa(timbre, luz);

        alarma.comprobar();
        alarma.movimiento();
        alarma.comprobar();

    }
}
