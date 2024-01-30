package Puerto;

public class Puerto {
    
    private ColaEspera camiones;
    private ColaEspera barcos;

    public Puerto(){
        camiones = new ColaEspera();
        barcos = new ColaEspera();
    }

    public void agregarBarco(Barco bb){
        barcos.agregarTransporte(bb);
    }

    public void agregarCamion(Camion cc){
        camiones.agregarTransporte(cc);
    }

    public String listarBarcos(){
        String aux = "";
        for(int i=0;i<barcos.getSize();i++){
            aux += barcos.get(i);
        }

        return aux;
    }

    public String listarCamiones(){
        String aux = "";
        for(int i=0;i<camiones.getSize();i++){
            aux += camiones.get(i);
        }

        return aux;
    }
}
