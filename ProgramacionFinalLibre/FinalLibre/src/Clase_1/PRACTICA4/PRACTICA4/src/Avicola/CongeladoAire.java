package Avicola;

import java.time.LocalDate;

public class CongeladoAire extends Refrigerado{

    private int pNitrogeno;
    private int pOxigeno;
    private int pVaporAgua;
    private int pDioxidoC;


    public CongeladoAire(LocalDate fechaVencimiento, int numeroLote, int codigoSupervision, int tempMantenimiento,
            String granjaOrigen, LocalDate fechaEnvasado,int pDioxidoC,int pNitrogeno,int pOxigeno, int pVaporAgua) {
        super(fechaVencimiento, numeroLote, codigoSupervision, tempMantenimiento, granjaOrigen, fechaEnvasado);
        this.pDioxidoC = pDioxidoC;
        this.pNitrogeno = pNitrogeno;
        this.pOxigeno = pOxigeno;
        this.pVaporAgua = pVaporAgua;        
    }

    public int getpNitrogeno() {
        return pNitrogeno;
    }

    public void setpNitrogeno(int pNitrogeno) {
        this.pNitrogeno = pNitrogeno;
    }

    public int getpOxigeno() {
        return pOxigeno;
    }

    public void setpOxigeno(int pOxigeno) {
        this.pOxigeno = pOxigeno;
    }

    public int getpVaporAgua() {
        return pVaporAgua;
    }

    public void setpVaporAgua(int pVaporAgua) {
        this.pVaporAgua = pVaporAgua;
    }

    public int getpDioxidoC() {
        return pDioxidoC;
    }

    public void setpDioxidoC(int pDioxidoC) {
        this.pDioxidoC = pDioxidoC;
    }
        
}
