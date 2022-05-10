package EC;

import java.util.Scanner;

/**
 * EjercicioCondMult
 */
public class EjercicioCondMult {

    public static void profesor() {
        System.out.println("La función del docente es enseñar"); 
       }
        public static void estudiante() {
            System.out.println("La función del estudiante es aprender");
        }
        public void maquinaPC() {
            System.out.println("La función de la Pc es Procesar Información");
        }
        public void proyector(){
            System.out.println("Proyectar una imagen, información");
        }

        public static void main(String[] args) {
         EjercicioCondMult objx=new EjercicioCondMult();
         

         Scanner lt=new Scanner(System.in);
         System.out.println("Ingrese el algoritmo que desea probar\n1=profesor"+"\n2=Estudiante\n3=Maquina\n4=Proyector");
         int opcMet=lt.nextInt();
         switch (opcMet) {
             case 1:{ profesor();  } break;
             case 2: estudiante(); break;
             case 3: objx.maquinaPC(); break;
             case 4: objx.proyector(); break;

         
             default: System.err.println("Opcion no existe"); break;
         }
        }

            
        
            
        
    }
