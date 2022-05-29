package Tarea;

public class Caja_Fuerte {
    public static void main(String[] args) {
      
      int intentos = 4;
      int numeroIntroducido;
      boolean acertado = false;
      
      do {
        System.out.print("Introduzca la clave de la caja fuerte, recuerde solo tiene "+intentos+" intentos, para ingresar bien la clave, de lo contrario el sistema se apagará, y los documentos se perderán para siempre: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
        
        if (numeroIntroducido == 2310) {
          acertado = true;
        } else {
          System.out.println("Lo siento, esa no es la combinación");
        }
        
        intentos--;
    
      } while((intentos > 0) && (!acertado));
      
      if (acertado) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
      } else {
        System.out.println("Los "+intentos+" intentos introducidos han sido incorrectos, activando el protocolo ´Protección de la nación´, los documentos de la caja fuerte se destruirán en 3 minutos ");
      }
    }
  }
