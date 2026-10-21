package Practicas.PatronesDeDiseño.Singleton;

public class Main {
    public static void main(String[] args) {
        
    System.out.println("Módulo de auntenticación");
    configuracion config1 = configuracion.getInstancia();

    System.out.println("Módulo de reportes");
    configuracion config2 = configuracion.getInstancia();

    System.out.println("Modulo de autenticación");
    config1.mostrarMensaje();

    System.out.println("Modulo de reportes");
    config2.mostrarMensaje();


    

    }
}
