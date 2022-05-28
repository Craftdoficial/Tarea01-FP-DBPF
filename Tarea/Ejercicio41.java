package Tarea;

import java.util.Scanner;

/**
 * Ejercicio41
 */
public class Ejercicio41 {

    static Scanner lt=new Scanner(System.in);
    
    public static void Salariodocente() {
    double salario=1500;
    int contador=1;
    while (contador<=6) {
        System.out.println("El salario en el año "+(contador-1)+" es de: "+salario);
        salario=salario+(salario*0.10);
        contador++;
       
    }
    //Datos de entrada
    System.out.println("El salario del año "+(contador-1)+" es de: "+salario);
    }
    public static void main(String[] args) {
        Salariodocente();
    }
}