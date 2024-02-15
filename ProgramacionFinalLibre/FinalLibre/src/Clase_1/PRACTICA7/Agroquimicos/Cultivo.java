package Agroquimicos;

import java.util.ArrayList;
/*  Un cultivo, tiene un nombre y una colección de enfermedades frecuentes que lo pueden
    afectar. Asimismo dado un producto químico, los cultivos son capaces de decir si en algún
    momento puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus
    enfermedades frecuentes y no se desaconseja su uso en el cultivo. 
*/
public class Cultivo {

    private String nombre;
    private ArrayList<Enfermedad> enfermedadesPosibles;

    public Cultivo(String nombre){
        this.nombre = nombre;
        enfermedadesPosibles = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarEnfermedad(Enfermedad enfermedad){
        if(!enfermedadesPosibles.add(enfermedad)){
            enfermedadesPosibles.add(enfermedad);
        }
    }

    public boolean productoUtil(Producto prod){
        /*Si el producto dado puede tratar alguna de sus enfermedades frecuentes. 
        Siempre y cuando no se desaconseje el uso en el cultivo. */
        if(!prod.cultivoDesaconsejado(this)){
            int i=0;
            boolean util = false;
            while (!util && i<enfermedadesPosibles.size()){
                if(prod.trataEnfermedad(enfermedadesPosibles.get(i))){
                    util = true;
                }
                i++;
            }
            return util; 
        }else{
            return false;
        }
        
    }
    
    @Override
    public boolean equals(Object cultivo){
        try {
            return this.getNombre().equals(((Cultivo)cultivo).getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
