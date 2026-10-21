package Practicas.PatronesDeDiseño.Singleton;

public class configuracion {

    private static configuracion instancia;
    //static, no se puede cambiar
    private configuracion () {
        System.out.println("Inicializando");
    }

    public static configuracion getInstancia () {

        if (instancia == null) {

            instancia = new configuracion();
        } 

        return instancia;
    }

    public void mostrarMensaje (){
        System.out.println("Configuración activa");
    }

    
}
