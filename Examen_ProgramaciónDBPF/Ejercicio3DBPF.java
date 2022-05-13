package Examen_Programación;

import java.util.Scanner;

/**
 * Ejercicio3DBPF
 */
public class Ejercicio3DBPF {
    static Scanner lt=new Scanner(System.in);

    public static void name() {
        System.out.println("Ingrese la pregunta");
        int  pregunta=lt.nextInt();
        switch (pregunta) {
            case 1:
            Ejercicio1DBPF(); break;
            case 2:
            Ejercicio2DBPF(); break;
            case 3:
            Ejercicio4DBPF(); break;
              default: break;
        }
        
    }
public static void main(String[] args) {

}
    private static void Ejercicio4DBPF() {
    }

    private static void Ejercicio2DBPF() {
    }

    private static void Ejercicio1DBPF() {
    }
}