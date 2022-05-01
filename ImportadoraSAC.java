import java.util.Scanner;

/**
 * ImportadoraSAC
 */
public class ImportadoraSAC {

    public static void main(String[] args) {
        //2.2
        //Definir variables
        double cantdolares, tipocambio=3.790, cantsoles;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese cantidad de Dólares:");
        cantdolares=lt.nextDouble();
        //Proceso
        cantsoles= cantdolares*tipocambio;
        //Datos de salida
        System.out.println("La cantidad es de S/."+cantsoles); 
    }
}