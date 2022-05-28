package EstCondicional;
import java.util.Scanner;

/**
 * Plazavea
 */
public class Plazavea {

    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar variables
        double totalapagar;
        int n;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de horas a usar" );
        n=lt.nextInt();
        //Proceso
        if (n<=2) {
            totalapagar= n*5;
        } else if (n<=5) {
            totalapagar=((n-2)*4)+10;
        } else if (n<=10) {
            totalapagar=((n-5)*3)+22;
        }else{
            totalapagar=((n-10)*2)+37;
                } { 
        }
        //Datos de salida
        System.out.println("La cantidad a pagar por es de"+totalapagar);
    }
}