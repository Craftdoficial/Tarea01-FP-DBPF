package EstCondicional;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 * Sanvalentin
 */
public class Ejercicio313 {

    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar variables
        int cantidadalumnos, costototal; 
        //Datos de entrada
        System.out.println("Ingrese la cantidad de alumnos que irán");
        cantidadalumnos=lt.nextInt();
        //Proceso
        if (cantidadalumnos<20) {
            costototal=cantidadalumnos*70;
        } else if (cantidadalumnos>=20 && cantidadalumnos<=49) {
            costototal=cantidadalumnos*40;
        } else if (cantidadalumnos>=50 && cantidadalumnos<=100) {
            costototal=cantidadalumnos*35;
        } else {
            costototal=cantidadalumnos*20;
        } 
        //Datos de salida   
        System.out.println("La cantidad a pagar por "+cantidadalumnos+" alumnos, es de"+costototal);
        }
}

