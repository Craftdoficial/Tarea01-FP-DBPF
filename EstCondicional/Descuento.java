import java.util.Scanner;

/**
 * Descuento
 */
public class Descuento {

    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar variables
        int precio;
        double Descuento, pagarás;
        //Datos de entrada
        System.out.println("Ingrese el precio del producto");
        precio=lt.nextInt();
        //Proceso
        if (precio<=100) {
            Descuento= precio*0.10;
        } else if (precio>100 && precio<200) {
            Descuento=precio*0.12;
        }else{
            Descuento=precio*0.15;
        }
        pagarás=precio-Descuento;
        //Datos de salida
        System.out.println("El precio con descuento aplicado es de" +pagarás);
        System.out.println("El descuento aplicado fue de "+Descuento+" soles");
        
        
    }
}