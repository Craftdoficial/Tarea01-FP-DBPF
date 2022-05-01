import java.util.Scanner;

/**
 * Tiempoenllegar
 */
public class Tiempoenllegar {

public static void main(String[] args) {
    //2.8
    //Definir variables
    double tiempo, distancia, velocidad;
    //Datos de entrada
    Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese la velocidad del ciclista en kilómetros por hora");
    velocidad= lt.nextDouble();
    System.out.println("Ingrese la distancia a recorrer en kilómetros");
    distancia= lt.nextDouble();
    //Proceso
    tiempo= distancia/velocidad;
    //Datos de salida
    System.out.println("EL tiempo que tardara el ciclista en llegar a la otra ciudad es de:"+tiempo);

}    
}
    

