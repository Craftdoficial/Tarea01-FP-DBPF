package subprogramas;

import java.util.Scanner;

public class ClaseGeneral {
    static Scanner leerT=new Scanner(System.in);
     static Aritmetica obj=new Aritmetica();
     static Persona objP=new Persona();
     static LeerTeclado objLT=new LeerTeclado();
 public static void main(String[] args) {
     
         /*System.out.println("Ingrese el Primer valor");
         int aX=leerT.nextInt();
         System.out.println("Ingrese el segundo valor");
         int bX=leerT.nextInt();
         int result=obj.sumar(aX, bX);
         System.out.println("La suma es: "+result);*/
         
         /*System.out.println("Ingrese su nombre:");
         objP.nombre=leerT.next();
         System.out.println("Ingrese su DNI");
         objP.dni=leerT.next();
         System.out.println("Ingrese una comida:");
         objP.comer(leerT.next());*/
         int resultA=objLT.print("Ingrese un valor", 0);
         int resultB=objLT.print("Ingrese un valor", 0);
         System.out.println(obj.sumar(resultA, resultB));
         
        
        }

 }   

