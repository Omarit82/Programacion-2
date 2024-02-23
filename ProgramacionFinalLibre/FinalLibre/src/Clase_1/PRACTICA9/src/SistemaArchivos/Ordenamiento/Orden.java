package SistemaArchivos.Ordenamiento;

import java.util.Comparator;
import SistemaArchivos.ElementoSistema;

public abstract class Orden implements Comparator<ElementoSistema>{
    
    public abstract int compare(ElementoSistema e1, ElementoSistema e2);
}
