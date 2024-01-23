package CentroComputos;

public abstract class ElementoCola {

    public boolean comparar(ElementoCola item){
        if(this.esMayor(item)){
            return true;
        }else{
            return false;
        }
    }

    public abstract boolean esMayor(ElementoCola ee);
}
