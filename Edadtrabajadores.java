import java.util.Scanner;

/**
 * Edadtrabajadores
 */
public class Edadtrabajadores {

    public static void main(String[] args) {
        //2.3
        //Definir variables
        double añonacimiento, cantaños, añoactual;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el año de nacimiento:");
        añonacimiento=lt.nextDouble();
        System.out.println("Ingrese el año actual");
        añoactual=lt.nextDouble();
        //Proceso
        cantaños= añoactual-añonacimiento;
        //Datos de salida
        System.out.println("La edad actual del trabajador es de" +cantaños);

    




    }
}
    
