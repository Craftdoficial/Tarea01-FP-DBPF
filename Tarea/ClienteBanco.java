package Tarea;
import java.util.Scanner;

public class ClienteBanco {

    public static void main(String[] args) {
        Scanner lt=new Scanner(System.in);
        int i, n;
        double cantidad_01_enero, cantidad_02_febrero, cantidad_03_marzo, cantidad_04_abril, cantidad_05_mayo;
        double cantidad_06_junio, cantidad_07_julio, cantidad_08_agosto, cantidad_09_septiembre, cantidad_10_octubre;
        double cantidad_11_noviembre, cantidad_12_diciembre, intereses=0, inversion_final, total;
        total = 0;
        System.out.print("Ingresa los años que se invertirá el dinero: ");
        n = lt.nextInt();
        lt.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa la cantidad depositada en el mes de enero: ");
            cantidad_01_enero = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de febrero : ");
            cantidad_02_febrero = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de marzo : ");
            cantidad_03_marzo = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de abril : ");
            cantidad_04_abril = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de mayo : ");
            cantidad_05_mayo = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de junio : ");
            cantidad_06_junio = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de julio : ");
            cantidad_07_julio = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de agosto : ");
            cantidad_08_agosto = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de septiembre : ");
            cantidad_09_septiembre = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de octubre: ");
            cantidad_10_octubre = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de noviembre: ");
            cantidad_11_noviembre = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa la cantidad depositada en el mes de diciembre: ");
            cantidad_12_diciembre = lt.nextDouble();
            lt.nextLine();
            total=cantidad_01_enero+cantidad_02_febrero+cantidad_03_marzo+cantidad_04_abril+cantidad_05_mayo+cantidad_06_junio+cantidad_07_julio+cantidad_08_agosto+cantidad_09_septiembre+cantidad_10_octubre+cantidad_11_noviembre+cantidad_12_diciembre;
            intereses=total*0.1;
            inversion_final=total+intereses;
            
            System.out.println("EL interes generado es de: "+ intereses+" soles");
            System.out.println("El dinero total generado es de: "+ inversion_final+" soles");
            System.out.println();
        }
        System.out.println("El dinero generado en estos "+n+" años es de "+total+" soles");
    }

}
