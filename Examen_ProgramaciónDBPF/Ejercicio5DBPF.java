package Examen_ProgramaciónDBPF;

import java.util.Scanner;

/**
 * Ejercicio3DBPF
 */
public class Ejercicio5DBPF {
    static Scanner st=new Scanner(System.in);
        
public static void Ejercicio1DBPF() {
    double promedio, examendeconocimiento, entrevistapersonal, testpsicológico; 
    String mensaje="";
    System.out.println("Ingrese la nota del examen de conocimiento");
    examendeconocimiento=st.nextInt();
    System.out.println("Ingrese la nota de entrevista personal");
    entrevistapersonal=st.nextInt();
    System.out.println("Ingrese la nota del test psicológico");
    testpsicológico=st.nextInt();
    if (examendeconocimiento<=20 && entrevistapersonal<=20 && testpsicológico<=20) {
        promedio=examendeconocimiento*0.40+entrevistapersonal*0.35+testpsicológico*0.25;
    
    if (promedio<11) {
        mensaje= "El nivel del estudiante es 1, por tanto no puede obtener la vacante"; 
    }
        if (promedio<14 && promedio>=11) {
            mensaje= "El nivel del estudiante es 2";
        }
        if (promedio<17 && promedio>=14) {
            mensaje= "El nivel del estudiante es 3";
        }
        if (promedio<=20) {        
         mensaje="El nivel del estudiante es 4";
        } 
    }
        else {
            mensaje= "La operación no es correcta";        }
        
        System.out.println(mensaje);
}
public static void Ejercicio2DBPF() {
    double totalapagar=0, precio, descuento=0, igv=0;
    System.out.println("Ingrese el precio del artículo");
    precio=st.nextDouble();
    if (precio<=500) {
        igv=totalapagar*0.18;
        totalapagar=precio;
    }
    
    if (precio>500 && precio<=1000) {
        
        descuento=precio*0.02;
        totalapagar=precio-descuento;
        igv=0.18*totalapagar;
    }

    if (precio>1000 && precio<=2000) {
        descuento=precio*0.05;
        totalapagar=precio-descuento; 
        igv=0.18*totalapagar;
    }

    if (precio>2000) {
        descuento=precio*0.10;
        totalapagar=precio-descuento;
        igv=0.18*totalapagar;
    }
        System.out.println("La cantidad total a pagar es de:"+totalapagar);
        System.out.println("El IGV del artículo con descuento es de: "+igv);
        System.out.println("El descuento aplicado del siguiente artículo es de:"+descuento);    
}
public static void Ejercicio3DBPF() {
    int v1, v2;
    double R;
    System.out.print("ingrese el primer numero: ");
    v1 = st.nextInt();
    System.out.print("ingrese el segundo numero: ");
    v2 = st.nextInt();
    char operador=st.next().charAt(0);
    R = Math.sqrt(v1);

    switch (operador){

        case '+': System.out.println(v1+v2); break;
        case '-': System.out.println(v1-v2); break;
        case '/': System.out.println(v1/v2); break;
        case 'x': System.out.println(v1*v2); break;
        case '%': System.out.println(v1%2); break;
        case '^': System.out.println(v1^v2); break;
        case 'R': System.out.println(+R); break;

        default: break;
    }
}
public static void Ejercicio4DBPF() {
    int edad, sexo;
    String mensaje="";
    System.out.println("Ingrese la edad");
     edad=st.nextInt();
     System.out.println("Ingrese el sexo: 1=mujer o 2=hombre");
     sexo=st.nextInt();
     if (edad>70) {
        mensaje="Te corresponde la vacuna C";
      }  if (edad<16) {
            mensaje="Te corresponde la vacuna A";
           }   
                
           if (sexo==1 && edad>=16 && edad<=69) {
                mensaje="Te corresponde la vacuna B";
               }    if (sexo==2 && edad>=16 && edad<=69) {
                    mensaje="Te corresponde la vacuna A";
               }
               System.out.println(mensaje);
            }
           public static void main(String[] args) {
            System.out.println("Coloque la pregunta que desee");
            int pregunta = st.nextInt();
            switch (pregunta) {
              case 1:
                Ejercicio1DBPF(); break;
              case 2:
                Ejercicio2DBPF(); break;
              case 3:
                Ejercicio3DBPF(); break;
              case 4:
               Ejercicio4DBPF(); break;
    
                default: break;
            }
        }
    } 


