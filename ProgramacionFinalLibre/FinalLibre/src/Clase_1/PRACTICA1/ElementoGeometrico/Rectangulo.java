package Clase_1.PRACTICA1.ElementoGeometrico;

public class Rectangulo {
    
    /* Atributos */
    private PuntoGeometrico vertice1 = new PuntoGeometrico(0, 0); //Valor por defecto.
    private PuntoGeometrico vertice2 = new PuntoGeometrico(1, 1); //Valor por defecto.
    private double lado1 = Math.sqrt(Math.pow(vertice1.getValorX()-vertice2.getValorX(), 2));
    private double lado2 = Math.sqrt(Math.pow(vertice1.getValorY()-vertice2.getValorY(), 2));
    /* Con dos vertices queda definido un rectangulo. 
    Para que sea válido, tanto las coordenadas x como y deben ser diferentes. */

    /* Constructor */

    public Rectangulo (PuntoGeometrico vertice1, PuntoGeometrico vertice2){
        setPuntosGeometricos(vertice1, vertice2);
    }


    /* Metodos Getter & Setter */

    public void setPuntosGeometricos(PuntoGeometrico vertice1, PuntoGeometrico vertice2){
        if((vertice1.getValorX() != vertice2.getValorX())&&(vertice1.getValorY() != vertice2.getValorY())){
            this.vertice1 = vertice1;
            this.vertice2 = vertice2;
        }
    }

    public void setPunto1 (PuntoGeometrico vertice1){
        if((vertice1.getValorX() != vertice2.getValorX())&&(vertice1.getValorY() != vertice2.getValorY())){
            this.vertice1 = vertice1;
        }
    }

    public void setPunto2 (PuntoGeometrico vertice2){
        if((vertice1.getValorX() != vertice2.getValorX())&&(vertice1.getValorY() != vertice2.getValorY())){
            this.vertice2 = vertice2;
        }
    }

    public PuntoGeometrico getPunto1(){
        return vertice1;
    }

    public PuntoGeometrico getPunto2(){
        return vertice2;
    }

    /* Metodos de funcionalidades */

    public void desplazamiento(double deltaX,double deltaY){
        vertice1.setValorX(vertice1.getValorX()+deltaX);
        vertice1.setValorY(vertice1.getValorY()+deltaY);
        vertice2.setValorX(vertice2.getValorX()+deltaX);
        vertice2.setValorY(vertice2.getValorY()+deltaY);
    }
    
    public double getArea(){     
        return lado1*lado2;
    }

    public int comparador(Rectangulo rectangulo){
        if(rectangulo.getArea() > this.getArea()){
            return 1;
        } else{
            if(rectangulo.getArea() < this.getArea()){
                return -1;
            }else{
                return 0;
            }
        }
    }

    public boolean esCuadrado(){
        if(lado1 == lado2){
            return true;
        }else{
            return false;
        }
    }

    public double ladoSuperior(){
        if(lado1 < lado2){
            return lado2;
        }else{
            return lado1;
        }
    }

    public String paradoAcostado(){
        if(lado1 < lado2){
            return "El rectangulo esta acostado";
        }else{
            return "El rectangulo esta parado";
        }
    }

    
}
