package EstRepetitivas;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/**
 * EjerciciosR
 */
public class EjerciciosR {
    public static void imprimirN1_10While() {
        int nminit=1;
        while (nminit<=10) {
            System.out.println(nminit);
            nminit=nminit+1;
        }
    }
    public static void imprimirN1_10doWhile() {
        int nminit=1;
        do {
            System.out.println(nminit); 
            nminit=nminit+1;
        } while (nminit<=10);
    }
    public static void imprimirN1_10For() {
        for (int nminit= 1; nminit <=10; nminit++) {
            System.out.println(nminit);       
        }
    }
    public static void imprimirNombreVertical() {
        //Declarar variables
        String nombre;
        String invert="";
        //Datos de entrada
        System.out.println("Ingrese su nombre");
        Scanner lt=new Scanner(System.in);
        nombre=lt.next();
        System.out.println("Ingrese su nombre=");
        nombre=lt.next();
        //Proceso y Salida
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
        for (int contador = nombre.length()-1; contador>=0; contador--){
            invert= invert+"\n"+nombre.charAt(contador);
        }
        System.out.println(invert);


        
    }
    public static void main(String[] args) {
        /*System.out.println("While");
        imprimirN1_10While();
        System.out.println("Do While");
        imprimirN1_10doWhile();
        System.out.println("For");
        imprimirN1_10For();*/
        imprimirNombreVertical();
    }
}
