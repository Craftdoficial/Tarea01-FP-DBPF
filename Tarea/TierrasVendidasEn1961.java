package Tarea;

import java.util.Scanner;

public class TierrasVendidasEn1961 {
static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        double P, ahorros, i, n, añoactual;
        System.out.println("Ingrese el año actual");
        añoactual=lt.nextDouble();
        n=añoactual-1961;
        P=1500.0;
        i=15.0/100.0;
        ahorros=P*Math.pow(1.0+i,n);
        System.out.println("Valor de dinero inicial: " + P);
        System.out.println("Ahorros conseguidos hasta ahora: " + ahorros);
        System.out.println("Valor de tasa anual : " + i);
        System.out.println("cantidad de años pasados: " + n);
    }

}
