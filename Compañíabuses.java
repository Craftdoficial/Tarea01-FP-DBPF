import java.util.Scanner;

/**
 * Compañíabuses
 */
public class Compañíabuses {

    public static void main(String[] args) {
        //2.7
        //Definir variables
        double cantkilometros, cobroporkilometro, cobrototal, pagaraentotal;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese cantidad de Kilómetros");
        cantkilometros= lt.nextDouble();
        System.out.println("Ingrese la cantidad a pagar por kilómetro");
        cobroporkilometro=lt.nextDouble();
        //Proceso
        cobrototal= cantkilometros*cobroporkilometro;
        pagaraentotal= Math.round(cobrototal);
        //Datos de salida
        System.out.println("La cantidad total a pagar por el/los kilómetros a recorrer establecidos es de S/."+pagaraentotal);
    }
}