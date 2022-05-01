import java.util.Scanner;

/**
 * Compañíapintura
 */
public class Compañíapintura {

    public static void main(String[] args) {
        //2.5
        //Definir variables
        double metroshorizontal, metrosvertical, cobropormetro, cantapagar, metrostotal;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de metros horizontales a pintar");
        metroshorizontal=lt.nextDouble();
        System.out.println("Ingrese la cantidad de metros verticales a pintar");
        metrosvertical=lt.nextDouble();
        System.out.println("Ingrese la cantidad a cobrar por metro");
        cobropormetro=lt.nextDouble();
        //Proceso
        metrostotal= metroshorizontal*metrosvertical;
        cantapagar= cobropormetro *metrostotal;
        //Datos de salida
        System.out.println("La cantidad total a pagar" +cantapagar);


    }
}