import java.util.Scanner;

/**
 * Viajedenegocios
 */
public class Viajedenegocios {

    public static void main(String[] args) {
        //2.14
        //Definir variables
        double costohotelpordia, costohotelporsemana, cuantosdiasestara, costodesayuno, costodesayunototal, costoalmuerzo, costoalmuerzototal, costocena, costocenatotal, dineroemergencia=100, chequetotal, costocomidatotal, dineroemergenciatotal;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Cuanto cobra el hotel por día");
        costohotelpordia= lt.nextDouble();
        System.out.println("Cuantos días se quedara");
        cuantosdiasestara= lt.nextDouble();
        System.out.println("Cuánto es el costo de desayuno por día");
        costodesayuno= lt.nextDouble();
        System.out.println("Cuánto es el costo de almuerzo por día");
        costoalmuerzo= lt.nextDouble();
        System.out.println("Cuánto es el costo de cena por día");
        costocena= lt.nextDouble();
        //Proceso
        costohotelporsemana= costohotelpordia*cuantosdiasestara;
        costodesayunototal= costodesayuno*cuantosdiasestara;
        costoalmuerzototal=costoalmuerzo*cuantosdiasestara;
        costocenatotal=costocena*cuantosdiasestara;
        costocomidatotal= costodesayunototal+costoalmuerzototal+costocenatotal;
        dineroemergenciatotal= 100*cuantosdiasestara;
        chequetotal= costohotelporsemana+costocomidatotal+dineroemergenciatotal;
        //Datos de salida
        System.out.println("La cantidad del cheque, que debe ser entregado al empleado es de S/."+chequetotal);


    }
}
