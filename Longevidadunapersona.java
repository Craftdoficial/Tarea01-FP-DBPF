import java.util.Scanner;

/**
 * Longevidadunapersona
 */
public class Longevidadunapersona {

    public static void main(String[] args) {
       //2.17
        //Definir variables
        double añosquetienes, diasvividos, mesesvividos, semanasvividas, horasvividas;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese su edad actual");
        añosquetienes=lt.nextDouble();
        //Proceso
        mesesvividos= Math.round(añosquetienes*12);
        semanasvividas= Math.round(mesesvividos*4.34524);
        diasvividos= Math.round(semanasvividas*7);
        horasvividas= Math.round(diasvividos*24);
        //Datos de salida
        System.out.println("Meses que la persona ha vivido:"  +mesesvividos);
        System.out.println("Semanas que la persona ha vivido:"  +semanasvividas);
        System.out.println("Días que la persona ha vivido:" +diasvividos);
        System.out.println("Horas que la persona ha vivido:" +horasvividas);

    



  
        


       
    }
}