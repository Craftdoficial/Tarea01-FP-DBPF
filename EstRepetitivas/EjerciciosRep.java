package EstRepetitivas;

import java.util.Scanner;

/**
 * EjerciciosRep
 */
public class EjerciciosRep {

    static Scanner lt=new Scanner(System.in);
    public static void ejer41while() {
     }
      public static void pregunta2DMP() {
          System.out.println("Ingrese el operador");
     char operador=lt.next().charAt(0);      
     switch (operador) {
         case '+': System.out.println("debes sumar"); break;
         case '%' : System.out.println("debes sacar el módulo"); break;
         default: break;
     }
        }
        public static void main(String[] args) {
            pregunta2DMP();
        }
    }

