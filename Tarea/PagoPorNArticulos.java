package Tarea;

import java.util.Scanner;

public class PagoPorNArticulos {

    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int i, n;
        double costo, descuento, pago_por_todo, precio;
        pago_por_todo = 0;
        System.out.print("Ingresa la cantidad de artículos a comprar: ");
        n = lt.nextInt();
        lt.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("Artículo" + i );
            System.out.print( "Ingresa el precio del artículo seleccionado: ");
            precio = lt.nextDouble();
            lt.nextLine();
            descuento=precio*0.1;
            if(precio>=200)
                descuento=precio*0.15;
            if(precio>100&&precio<200)
                descuento=precio*0.12;
            costo=precio-descuento;
            pago_por_todo=pago_por_todo+costo;
            System.out.println("El costo final del artículo es de "+ costo+" soles");
            System.out.println("El descuento aplicado es de  "+ descuento+" soles");
            System.out.println();
        }
        System.out.println("Por todos los artículos seleccionado el cliente pago "+ pago_por_todo+" soles");
    }

}