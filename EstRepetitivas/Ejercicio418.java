package EstRepetitivas;

import java.util.Scanner;

/**
 * Ejercicio418
 */
public class Ejercicio418 {

    static Scanner lt=new Scanner(System.in);
    public static void impuestoVehículos418() {
        //Declarar variables
        String claveV, hayMas="S";
        int cantVC1=0, cantVC2=0, cantVC3=0;
        double precioVC1=0, precioVC2=0, precioVC3=0, impVC1=0, impVC2=0, impVC3=0, totalimpV=0;
        while (hayMas.equals("S")) {
            System.out.println("Ingrese la clave del Vehículo (VC1,VC2,VC3):");
            claveV=lt.next().toUpperCase();
            if (claveV.equals("VC1")) {
                System.out.println("Ingrese la cantidad de de Vehículos con clave "+claveV+":");
                cantVC1=cantVC1+lt.nextInt();
                if (precioVC1==0){
                System.out.println("Ingrese el precio del Vehículo con clave"+claveV+":");
                precioVC1=lt.nextDouble();
                }
                impVC1=precioVC1*0.10;
            }else if (claveV.equals("VC2")){
                System.out.println("Ingrese la cantidade de Vehículo con clave"+claveV+":");
                cantVC2= cantVC2+lt.nextInt();
                if (precioVC2==0){
                System.out.println("Ingrese el precio del Vehículo con clave"+claveV+":");
                precioVC2=lt.nextDouble();
                }
                impVC2=precioVC2*0.07;
            }else if (claveV.equals("VC3")){
                System.out.println("Ingrese la cantidad de de Vehículo con clave "+claveV+":");
                cantVC3=cantVC3+lt.nextInt();
                if (precioVC3==0){
                System.out.println("Ingrese el precio del Vehículo con clave"+claveV+":");
                precioVC3=lt.nextDouble();
                }
                impVC3=precioVC3*0.05;
            } else{ System.out.println("La clave de vehículo es incorrecta");}
            System.out.println("Hay más vehículos?: S=Si, N=NO");
            hayMas= String.valueOf(lt.next().toUpperCase().charAt(0));    
        }
        System.out.println("Impuesto de Vehículo VC1 es:"+impVC1);
        System.out.println("Impuesto de Vehículo VC2 es:"+impVC2);
        System.out.println("Impuesto de Vehículo VC3 es:"+impVC3);

        System.out.println("Impuesto Total de Vehículo VC1 es:"+(impVC1*cantVC1));
        System.out.println("Impuesto Total de Vehículo VC2 es:"+(impVC2*cantVC2));
        System.out.println("Impuesto Total de Vehículo VC3 es:"+(impVC3*cantVC3));

        totalimpV=(impVC1*cantVC1)+(impVC2*cantVC2)+(impVC3*cantVC3);
        System.out.println("Total impuesto a pagar de "+(cantVC1+cantVC2+cantVC3)+"es:"+totalimpV);

    }
    public static void main(String[] args) {
        impuestoVehículos418();
    }
}
