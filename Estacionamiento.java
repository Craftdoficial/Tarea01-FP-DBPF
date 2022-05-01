import java.util.Scanner;

/**
 * Estacionamiento
 */
public class Estacionamiento {

    public static void main(String[] args) {
        //2.4
        //Definir variables
        double canthoras, cobroporhora, totalapagar;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese cantidad de horas a usar:");
        canthoras=lt.nextDouble();
        System.out.println("Ingrese el cobro por hora del estacionamiento");
        cobroporhora= lt.nextDouble();
        //Proceso
        totalapagar= cobroporhora*Math.round(canthoras);
        //Datos de salida
        System.out.println("El monto a pagar por el uso del estacionamiento es de S/."+totalapagar);
    }
}
