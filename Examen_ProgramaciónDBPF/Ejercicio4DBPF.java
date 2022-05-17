package Examen_ProgramaciónDBPF;
import java.util.Scanner;

/**
 * Ejercicio4DBPF
 */
public class Ejercicio4DBPF { 

    static Scanner lt=new Scanner(System.in);

public static void main(String[] args) {
    //Declarar variables
    int edad, sexo;
    String mensaje="";
     //Datos de entrada
     System.out.println("Ingrese la edad");
     edad=lt.nextInt();
     System.out.println("Ingrese el sexo: 1=mujer o 2=hombre");
     sexo=lt.nextInt();
     //Proceso
     if (edad>70) {
         mensaje="Te corresponde la vacuna C";
       }  if (edad<16) {
             mensaje="Te corresponde la vacuna A";
            }   
                 
            if (sexo==1 && edad>=16 && edad<=69) {
                 mensaje="Te corresponde la vacuna B";
                }    if (sexo==2 && edad>=16 && edad<=69) {
                     mensaje="Te corresponde la vacuna A";
                }
         //Datos de salida
         System.out.println(mensaje);
     }
 

}
 
    