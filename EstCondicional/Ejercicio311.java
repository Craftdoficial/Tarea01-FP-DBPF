package EstCondicional;
import java.util.Scanner;

/**
 * Ejercicio311
 */
public class Ejercicio311 {

    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        double bono;
        int cnatañostrabajando ;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de años trabajando en esta tienda");
        cnatañostrabajando=lt.nextInt();
        //Proceso
        if (cnatañostrabajando<=1) {
            bono=100;
        } else if (cnatañostrabajando>1 && cnatañostrabajando<3) {
            bono=200;
         } else if (cnatañostrabajando>2 && cnatañostrabajando<4) {
             bono=300;
          } else if (cnatañostrabajando>3 && cnatañostrabajando<5) {
              bono=400;
          } else if (cnatañostrabajando>4 && cnatañostrabajando<6) {
              bono=500;
           } else {
               bono=1000;
          }
                 //Datos de salida
                 System.out.println("El bono que le toca al siguiente empleado por haber trabajado "+cnatañostrabajando+" años, es de"+bono);

    }
}