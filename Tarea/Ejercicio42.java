package Tarea;

import java.util.Scanner;

public class Ejercicio42 {
    static Scanner lt=new Scanner(System.in);
    public static void Bembos() {
        //Declarar variables
        String hamburguesa, hayMas= "S", pagaracon="T";
        int canthamburguesaS=0, canthamburguesaD=0, canthamburguesaT=0;
        double precioS=0, precioD=0, precioT=0, totalpagar=0, preciototalporhamburguesaS=0, preciototalporhamburguesaD=0, preciototalporhamburguesaT=0;
        while (hayMas.equals("S")) {
            System.out.println("Ingrese cuál será la hamburguesa(SENCILLAS/DOBLES/TRIPLES):");
            hamburguesa=lt.next().toUpperCase();
            if (hamburguesa.equals("SENCILLAS")) {
                System.out.println("Ingrese la cantidad de hamburguesas "+hamburguesa+" :");
                canthamburguesaS=canthamburguesaS+lt.nextInt();
                if (precioS==0) {
                    System.out.println("Ingrese el precio de las hamburguesas "+hamburguesa+" :");
                    precioS=lt.nextDouble();
                }
                preciototalporhamburguesaS=precioS*canthamburguesaS;
            } else if (hamburguesa.equals("DOBLES")) {
                System.out.println("Ingrese la cantidad de hamburguesas "+hamburguesa+" :");
                canthamburguesaD=canthamburguesaD+lt.nextInt();
                if (precioD==0) {
                    System.out.println("Ingrese el precio de las hamburguesas "+hamburguesa+" :");
                    precioD=lt.nextDouble();
                }
                preciototalporhamburguesaD=precioD*canthamburguesaD;
            } else if (hamburguesa.equals("TRIPLES")) {
                System.out.println("Ingrese la cantidad de hamburguesas "+hamburguesa+" :");
                canthamburguesaT=canthamburguesaT+lt.nextInt();
                if (precioT==0) {
                    System.out.println("Ingrese el precio de las hamburguesas "+hamburguesa+":");
                    precioT=lt.nextDouble();
                }
                preciototalporhamburguesaT=precioT*canthamburguesaT;
                    
            } else { System.out.println("La hamburguesa solicitada no existe, porfavor eliga otra");}
            System.out.println("¿Hay más hamburguesas a elegir? : S=Si, N=NO");
            hayMas=String.valueOf(lt.next().toUpperCase().charAt(0));
            System.out.println("EL cliente pagará con T=Tarjeta, E=Efectivo");
            pagaracon=String.valueOf(lt.next().toUpperCase().charAt(0));
            if (pagaracon=="Tarjeta") {
            if (pagaracon== "Tarjeta") {
                totalpagar=lt.nextDouble(); }
       totalpagar= (preciototalporhamburguesaS+preciototalporhamburguesaD+preciototalporhamburguesaT)+((preciototalporhamburguesaS+preciototalporhamburguesaD+preciototalporhamburguesaT)*0.05);
             }  if (pagaracon=="Efectivo") {
                 if (pagaracon=="Efectivo") {
        totalpagar=lt.nextDouble();}
        totalpagar= (preciototalporhamburguesaS+preciototalporhamburguesaD+preciototalporhamburguesaT);
        }
     }
        System.out.println("El precio por hamburguesa sencilla es de "+precioS+" soles");
        System.out.println("El precio por hamburguesa doble es de "+precioD+" soles");
        System.out.println("El precio por hamburguesa triple es de "+precioT+" soles");

        System.out.println("El precio total por "+canthamburguesaS+" hamburguesas sencillas es de "+preciototalporhamburguesaS+" soles");
        System.out.println("El precio total por "+canthamburguesaD+" hamburguesas dobles es de "+preciototalporhamburguesaD+" soles");
        System.out.println("El precio total por "+canthamburguesaT+" hamburguesas triples es de "+preciototalporhamburguesaT+" soles");
        System.out.println("El resultado total a pagar por las hamburguesas elegidas por el clientes, es de: "+totalpagar+" soles");
    }
    public static void main(String[] args) {
        Bembos();
    }
}
