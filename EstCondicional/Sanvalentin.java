package EstCondicional;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 * Sanvalentin
 */
public class Sanvalentin {

    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar variables
        int dinerodisponible; 
        String mensaje;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de dinero que dispone");
        dinerodisponible=lt.nextInt();
        //Proceso
        if (dinerodisponible<=10) {
            mensaje="Puedes regalar una tarjeta";
        } else if (dinerodisponible>=11 && dinerodisponible<=100) {
            mensaje="Puedes regalar un chocolate";
        } else if (dinerodisponible>=101 && dinerodisponible<=250) {
            mensaje="Puedes regalar unas flores";
        } else {
            mensaje="Puedes regalar un anillo";
        } 
        //Datos de salida   
        System.out.println(mensaje);
        }
}
