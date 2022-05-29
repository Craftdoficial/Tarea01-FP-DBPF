package Tarea;

import java.util.*;

public class TablaMultiplicar {

    public static void main(String[] args) {
 
        Scanner  lt= new Scanner(System.in);
        int n;
        System.out.print("Introduce un número, para generar las multiplicaciones: ");                                                         
        n = lt.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}