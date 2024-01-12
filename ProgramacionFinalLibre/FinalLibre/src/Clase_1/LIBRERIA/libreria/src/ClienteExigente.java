public class ClienteExigente extends Cliente{

    public ClienteExigente(String nombre, String apellido, int dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }

    @Override
    public boolean meGusta(ProductoLibreria producto){
        boolean salida = false;
        if(super.meGusta(producto)){
            for (String genero : this.generos) {
                if(producto.contieneGenero(genero)){
                    salida = true;
                }
            }
        }   
        return salida;
    }
    
}
