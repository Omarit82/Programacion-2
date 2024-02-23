package SistemaArchivos;

import java.time.LocalDate;

public class Link extends ElementoSistema{
    
    public static final double TAMANIO = 1;
    public static final String PREFIJO ="Acceso directo a: ";
    private ElementoSistema apuntado;

    public Link(ElementoSistema elemento, LocalDate fechaCreacion){    
        super(PREFIJO+ elemento.getNombre(),fechaCreacion);
        this.apuntado = elemento;
    }
    
    @Override
    public double getTamanio(){
        return TAMANIO;
    }

    public int cantidadArchivos(){
        return 0;
    }

    public int cantidadElementos(){
        return 1;
    }
    
}
