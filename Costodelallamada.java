import java.util.Scanner;

/**
 * Costodelallamada
 */
public class Costodelallamada {

    public static void main(String[] args) {
        //2.9
        //Definir variables
        double minutosllamada, cobroporminuto, entotalsepagara, minutostotalesllamada;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos usados");
        minutosllamada= lt.nextDouble();
        System.out.println("Ingrese la cantidad que se cobrará por minuto");
        cobroporminuto= lt.nextDouble();
        //Proceso
       minutostotalesllamada= Math.round(minutosllamada); 
        entotalsepagara= minutostotalesllamada*cobroporminuto;
        //Datos de salida
        System.out.println("Por la cantidad de minutos usados, se cobrará en total S/." +entotalsepagara);
    }
}
