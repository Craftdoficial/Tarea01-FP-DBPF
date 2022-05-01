import java.util.Scanner;

/**
 * Areadeltrapecio
 */
public class Areadeltrapecio {

    public static void main(String[] args) {
        //2.20
        //Definir variables
        double basemayor, basemenor, altura, Areadeltrapecio;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la base mayor del trapecio");
        basemayor=lt.nextDouble();
        System.out.println("Ingrese la base menor del trapecio");
        basemenor=lt.nextDouble();
        System.out.println("Ingrese la altura del trapecio");
        altura=lt.nextDouble();
        //Proceso
        Areadeltrapecio= ((basemayor+basemenor)/2)*altura;
        //Datos de salida
        System.out.println("El área del siguiente trapecio es:" +Areadeltrapecio);
    }
}
