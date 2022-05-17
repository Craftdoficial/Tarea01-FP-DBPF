package Examen_ProgramaciónDBPF;
import java.util.Scanner;

/**
 * Ejercicio1DBPF
 */
public class Ejercicio1DBPF { 

    static Scanner lt=new Scanner(System.in);

public static void main(String[] args) {
    //Declarar variables
    double promedio, examendeconocimiento, entrevistapersonal, testpsicológico; 
    String mensaje="";
     
    //Datos de entrada
    System.out.println("Ingrese la nota del examen de conocimiento");
    examendeconocimiento=lt.nextInt();
    System.out.println("Ingrese la nota de entrevista personal");
    entrevistapersonal=lt.nextInt();
    System.out.println("Ingrese la nota del test psicológico");
    testpsicológico=lt.nextInt();
    //Proceso
    if (examendeconocimiento<=20 && entrevistapersonal<=20 && testpsicológico<=20) {
        promedio=examendeconocimiento*0.40+entrevistapersonal*0.35+testpsicológico*0.25;
    
    if (promedio<11) {
        mensaje= "El nivel del estudiante es 1, por tanto no puede obtener la vacante"; 
    }
        if (promedio<14 && promedio>=11) {
            mensaje= "El nivel del estudiante es 2";
        }
        if (promedio<17 && promedio>=14) {
            mensaje= "El nivel del estudiante es 3";
        }
        if (promedio<=20) {        
         mensaje="El nivel del estudiante es 4";
        } 
    }
        else {
            mensaje= "La operación no es correcta";        }
            //Datos de salida
        System.out.println(mensaje);
        

 

}
} 
    