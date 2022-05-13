package Examen_Programación;
import java.util.Scanner;

/**
 * Ejercicio1DBPF
 */
public class Ejercicio2DBPF { 

    static Scanner lt=new Scanner(System.in);

public static void main(String[] args) {
    //Declarar variables
    double totalapagar=0, precio, descuento=0, igv=0;
    //Datos de entrada
    System.out.println("Ingrese el precio del artículo");
    precio=lt.nextDouble();
    //Proceso
    if (precio<=500) {
        igv=totalapagar*0.18;
        totalapagar=precio;
    }
    
    if (precio>500 && precio<=1000) {
        
        descuento=precio*0.02;
        totalapagar=precio-descuento;
        igv=0.18*totalapagar;
    }

    if (precio>1000 && precio<=2000) {
        descuento=precio*0.05;
        totalapagar=precio-descuento; 
        igv=0.18*totalapagar;
    }

    if (precio>2000) {
        descuento=precio*0.10;
        totalapagar=precio-descuento;
        igv=0.18*totalapagar;
    }
            //Datos de salida
        System.out.println("La cantidad total a pagar es de:"+totalapagar);
        System.out.println("El IGV del artículo con descuento es de: "+igv);
        System.out.println("El descuento aplicado del siguiente artículo es de:"+descuento);


 

}
} 
    

        

 



    